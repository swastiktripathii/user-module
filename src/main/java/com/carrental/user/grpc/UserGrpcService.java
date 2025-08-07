package com.carrental.user.grpc;

import com.carrental.user.model.LoginHistory;
import com.carrental.user.model.User;
import com.carrental.user.model.UserType;
import com.carrental.user.repository.LoginHistoryRepository;
import com.carrental.user.service.UserService;
import com.carrental.user.security.JwtUtil;
import com.opencsv.CSVReader;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;

import java.io.StringReader;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

@GrpcService
@RequiredArgsConstructor
public class UserGrpcService extends UserServiceGrpc.UserServiceImplBase {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    private final LoginHistoryRepository loginHistoryRepository;
    private final JwtUtil jwtUtil;

    // RegisterUser implementation
    @Override
    public void registerUser(RegisterUserRequest request, StreamObserver<RegisterUserResponse> responseObserver) {
        try {
            User user = userService.registerUser(
                    request.getName(),
                    request.getEmail(),
                    request.getPassword(),
                    UserType.valueOf(request.getUserType())
            );

            RegisterUserResponse response = RegisterUserResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("User registered successfully: " + user.getEmail())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception ex) {
            RegisterUserResponse response = RegisterUserResponse.newBuilder()
                    .setSuccess(false)
                    .setMessage("Failed to register user: " + ex.getMessage())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    // LoginUser implementation
    @Override
    public void loginUser(LoginUserRequest request, StreamObserver<LoginUserResponse> responseObserver) {
        try {
            User user = userService.findByEmail(request.getEmail());

            if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
                LoginUserResponse response = LoginUserResponse.newBuilder()
                        .setSuccess(false)
                        .setMessage("Invalid credentials")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
                return;
            }

            // Record login event
            LoginHistory loginHistory = LoginHistory.builder()
                    .user(user)
                    .loginTime(java.time.LocalDateTime.now())
                    .ipAddress(request.getIpAddress())
                    .build();
            loginHistoryRepository.save(loginHistory);

            // Generate JWT token
            String token = jwtUtil.generateToken(user.getEmail());

            LoginUserResponse response = LoginUserResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Login successful")
                    .setToken(token)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception ex) {
            LoginUserResponse response = LoginUserResponse.newBuilder()
                    .setSuccess(false)
                    .setMessage("Login failed: " + ex.getMessage())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    // UploadUsers implementation (CSV parsing)
    @Override
    public void uploadUsers(UploadUsersRequest request, StreamObserver<UploadUsersResponse> responseObserver) {
        List<String> successes = new ArrayList<>();
        List<String> errors = new ArrayList<>();

        try {

            // Parse users from request
            if (request.getUsersCount() == 0) {
                errors.add("No users provided for upload.");
            }

            for (UserUploadRow row : request.getUsersList()) {
                String name = row.getName();
                String email = row.getEmail();
                String password = row.getPassword();
                String userTypeStr = row.getUserType();

                if (!StringUtils.hasText(email) || !StringUtils.hasText(password) || !StringUtils.hasText(name) || !StringUtils.hasText(userTypeStr)) {
                    errors.add("Invalid data: fields cannot be empty for user with email: " + email);
                    continue;
                }

                UserType userType;
                try {
                    userType = UserType.valueOf(userTypeStr);
                } catch (IllegalArgumentException e) {
                    errors.add("Invalid userType for email: " + email);
                    continue;
                }

                try {
                    userService.registerUser(name, email, password, userType);
                    successes.add(email);
                } catch (Exception e) {
                    errors.add("Failed to add user " + email + ": " + e.getMessage());
                }
            }

            UploadUsersResponse response = UploadUsersResponse.newBuilder()
                    .addAllSuccesses(successes)
                    .addAllErrors(errors)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception ex) {
            UploadUsersResponse response = UploadUsersResponse.newBuilder()
                    .addAllErrors(Collections.singletonList("Upload failed: " + ex.getMessage()))
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    // GetLoginHistory implementation
    @Override
    public void getLoginHistory(GetLoginHistoryRequest request, StreamObserver<GetLoginHistoryResponse> responseObserver) {
        try {
            // Validate admin token if applicable (skipped here)

            Optional<User> userOpt = userService.getUserByIdOptional(request.getUserId());
            if (userOpt.isEmpty()) {
                responseObserver.onError(new Throwable("User not found with id: " + request.getUserId()));
                return;
            }
            User user = userOpt.get();

            List<LoginHistory> histories = loginHistoryRepository.findByUser(user);

            DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME.withZone(ZoneId.systemDefault());

            GetLoginHistoryResponse.Builder responseBuilder = GetLoginHistoryResponse.newBuilder();

            for (LoginHistory history : histories) {
                responseBuilder.addHistory(LoginHistoryInfo.newBuilder()
                        .setLoginTime(history.getLoginTime().toString()) // Formatting can be customized
                        .setIpAddress(history.getIpAddress())
                        .build());
            }

            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();

        } catch (Exception ex) {
            responseObserver.onError(ex);
        }
    }
}
