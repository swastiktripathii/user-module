package com.carrental.user.service;

import com.carrental.user.model.User;
import com.carrental.user.model.UserType;
import com.carrental.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public User registerUser(String name, String email, String password, UserType type) {
        userRepository.findByEmail(email).ifPresent(u -> {
            throw new IllegalArgumentException("Email already registered: " + email);
        });

        User user = User.builder()
                .name(name)
                .email(email)
                .userType(type)
                .password(passwordEncoder.encode(password))
                .build();

        return userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found with email " + email));
    }

    public Optional<User> getUserByIdOptional(Long id) {
        return userRepository.findById(id);
    }
}
