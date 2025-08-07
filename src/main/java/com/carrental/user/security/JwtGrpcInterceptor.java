package com.carrental.user.security;

import io.grpc.*;
import org.lognet.springboot.grpc.GRpcGlobalInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@GRpcGlobalInterceptor
public class JwtGrpcInterceptor implements ServerInterceptor {
    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {
        String authHeader = headers.get(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER));
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String token = authHeader.substring(7);
            try {
                String username = jwtUtil.extractUsername(token);
                if (!jwtUtil.validateToken(token, username)) {
                    call.close(Status.UNAUTHENTICATED.withDescription("Invalid JWT token"), headers);
                    return new ServerCall.Listener<ReqT>() {};
                }
            } catch (Exception e) {
                call.close(Status.UNAUTHENTICATED.withDescription("JWT validation failed: " + e.getMessage()), headers);
                return new ServerCall.Listener<ReqT>() {};
            }
        } else {
            call.close(Status.UNAUTHENTICATED.withDescription("Missing or invalid Authorization header"), headers);
            return new ServerCall.Listener<ReqT>() {};
        }
        return next.startCall(call, headers);
    }
}

