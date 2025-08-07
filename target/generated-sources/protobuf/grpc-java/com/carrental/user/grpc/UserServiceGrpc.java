package com.carrental.user.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: user_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.carrental.user.grpc.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.carrental.user.grpc.RegisterUserRequest,
      com.carrental.user.grpc.RegisterUserResponse> getRegisterUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterUser",
      requestType = com.carrental.user.grpc.RegisterUserRequest.class,
      responseType = com.carrental.user.grpc.RegisterUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.carrental.user.grpc.RegisterUserRequest,
      com.carrental.user.grpc.RegisterUserResponse> getRegisterUserMethod() {
    io.grpc.MethodDescriptor<com.carrental.user.grpc.RegisterUserRequest, com.carrental.user.grpc.RegisterUserResponse> getRegisterUserMethod;
    if ((getRegisterUserMethod = UserServiceGrpc.getRegisterUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegisterUserMethod = UserServiceGrpc.getRegisterUserMethod) == null) {
          UserServiceGrpc.getRegisterUserMethod = getRegisterUserMethod =
              io.grpc.MethodDescriptor.<com.carrental.user.grpc.RegisterUserRequest, com.carrental.user.grpc.RegisterUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.carrental.user.grpc.RegisterUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.carrental.user.grpc.RegisterUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RegisterUser"))
              .build();
        }
      }
    }
    return getRegisterUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.carrental.user.grpc.LoginUserRequest,
      com.carrental.user.grpc.LoginUserResponse> getLoginUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginUser",
      requestType = com.carrental.user.grpc.LoginUserRequest.class,
      responseType = com.carrental.user.grpc.LoginUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.carrental.user.grpc.LoginUserRequest,
      com.carrental.user.grpc.LoginUserResponse> getLoginUserMethod() {
    io.grpc.MethodDescriptor<com.carrental.user.grpc.LoginUserRequest, com.carrental.user.grpc.LoginUserResponse> getLoginUserMethod;
    if ((getLoginUserMethod = UserServiceGrpc.getLoginUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLoginUserMethod = UserServiceGrpc.getLoginUserMethod) == null) {
          UserServiceGrpc.getLoginUserMethod = getLoginUserMethod =
              io.grpc.MethodDescriptor.<com.carrental.user.grpc.LoginUserRequest, com.carrental.user.grpc.LoginUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.carrental.user.grpc.LoginUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.carrental.user.grpc.LoginUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("LoginUser"))
              .build();
        }
      }
    }
    return getLoginUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.carrental.user.grpc.UploadUsersRequest,
      com.carrental.user.grpc.UploadUsersResponse> getUploadUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadUsers",
      requestType = com.carrental.user.grpc.UploadUsersRequest.class,
      responseType = com.carrental.user.grpc.UploadUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.carrental.user.grpc.UploadUsersRequest,
      com.carrental.user.grpc.UploadUsersResponse> getUploadUsersMethod() {
    io.grpc.MethodDescriptor<com.carrental.user.grpc.UploadUsersRequest, com.carrental.user.grpc.UploadUsersResponse> getUploadUsersMethod;
    if ((getUploadUsersMethod = UserServiceGrpc.getUploadUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUploadUsersMethod = UserServiceGrpc.getUploadUsersMethod) == null) {
          UserServiceGrpc.getUploadUsersMethod = getUploadUsersMethod =
              io.grpc.MethodDescriptor.<com.carrental.user.grpc.UploadUsersRequest, com.carrental.user.grpc.UploadUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.carrental.user.grpc.UploadUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.carrental.user.grpc.UploadUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UploadUsers"))
              .build();
        }
      }
    }
    return getUploadUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.carrental.user.grpc.GetLoginHistoryRequest,
      com.carrental.user.grpc.GetLoginHistoryResponse> getGetLoginHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLoginHistory",
      requestType = com.carrental.user.grpc.GetLoginHistoryRequest.class,
      responseType = com.carrental.user.grpc.GetLoginHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.carrental.user.grpc.GetLoginHistoryRequest,
      com.carrental.user.grpc.GetLoginHistoryResponse> getGetLoginHistoryMethod() {
    io.grpc.MethodDescriptor<com.carrental.user.grpc.GetLoginHistoryRequest, com.carrental.user.grpc.GetLoginHistoryResponse> getGetLoginHistoryMethod;
    if ((getGetLoginHistoryMethod = UserServiceGrpc.getGetLoginHistoryMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetLoginHistoryMethod = UserServiceGrpc.getGetLoginHistoryMethod) == null) {
          UserServiceGrpc.getGetLoginHistoryMethod = getGetLoginHistoryMethod =
              io.grpc.MethodDescriptor.<com.carrental.user.grpc.GetLoginHistoryRequest, com.carrental.user.grpc.GetLoginHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLoginHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.carrental.user.grpc.GetLoginHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.carrental.user.grpc.GetLoginHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetLoginHistory"))
              .build();
        }
      }
    }
    return getGetLoginHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void registerUser(com.carrental.user.grpc.RegisterUserRequest request,
        io.grpc.stub.StreamObserver<com.carrental.user.grpc.RegisterUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterUserMethod(), responseObserver);
    }

    /**
     */
    default void loginUser(com.carrental.user.grpc.LoginUserRequest request,
        io.grpc.stub.StreamObserver<com.carrental.user.grpc.LoginUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginUserMethod(), responseObserver);
    }

    /**
     */
    default void uploadUsers(com.carrental.user.grpc.UploadUsersRequest request,
        io.grpc.stub.StreamObserver<com.carrental.user.grpc.UploadUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadUsersMethod(), responseObserver);
    }

    /**
     */
    default void getLoginHistory(com.carrental.user.grpc.GetLoginHistoryRequest request,
        io.grpc.stub.StreamObserver<com.carrental.user.grpc.GetLoginHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLoginHistoryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerUser(com.carrental.user.grpc.RegisterUserRequest request,
        io.grpc.stub.StreamObserver<com.carrental.user.grpc.RegisterUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loginUser(com.carrental.user.grpc.LoginUserRequest request,
        io.grpc.stub.StreamObserver<com.carrental.user.grpc.LoginUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadUsers(com.carrental.user.grpc.UploadUsersRequest request,
        io.grpc.stub.StreamObserver<com.carrental.user.grpc.UploadUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLoginHistory(com.carrental.user.grpc.GetLoginHistoryRequest request,
        io.grpc.stub.StreamObserver<com.carrental.user.grpc.GetLoginHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLoginHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.carrental.user.grpc.RegisterUserResponse registerUser(com.carrental.user.grpc.RegisterUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.carrental.user.grpc.LoginUserResponse loginUser(com.carrental.user.grpc.LoginUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.carrental.user.grpc.UploadUsersResponse uploadUsers(com.carrental.user.grpc.UploadUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.carrental.user.grpc.GetLoginHistoryResponse getLoginHistory(com.carrental.user.grpc.GetLoginHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLoginHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.carrental.user.grpc.RegisterUserResponse> registerUser(
        com.carrental.user.grpc.RegisterUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.carrental.user.grpc.LoginUserResponse> loginUser(
        com.carrental.user.grpc.LoginUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.carrental.user.grpc.UploadUsersResponse> uploadUsers(
        com.carrental.user.grpc.UploadUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.carrental.user.grpc.GetLoginHistoryResponse> getLoginHistory(
        com.carrental.user.grpc.GetLoginHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLoginHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_USER = 0;
  private static final int METHODID_LOGIN_USER = 1;
  private static final int METHODID_UPLOAD_USERS = 2;
  private static final int METHODID_GET_LOGIN_HISTORY = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_USER:
          serviceImpl.registerUser((com.carrental.user.grpc.RegisterUserRequest) request,
              (io.grpc.stub.StreamObserver<com.carrental.user.grpc.RegisterUserResponse>) responseObserver);
          break;
        case METHODID_LOGIN_USER:
          serviceImpl.loginUser((com.carrental.user.grpc.LoginUserRequest) request,
              (io.grpc.stub.StreamObserver<com.carrental.user.grpc.LoginUserResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_USERS:
          serviceImpl.uploadUsers((com.carrental.user.grpc.UploadUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.carrental.user.grpc.UploadUsersResponse>) responseObserver);
          break;
        case METHODID_GET_LOGIN_HISTORY:
          serviceImpl.getLoginHistory((com.carrental.user.grpc.GetLoginHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.carrental.user.grpc.GetLoginHistoryResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegisterUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.carrental.user.grpc.RegisterUserRequest,
              com.carrental.user.grpc.RegisterUserResponse>(
                service, METHODID_REGISTER_USER)))
        .addMethod(
          getLoginUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.carrental.user.grpc.LoginUserRequest,
              com.carrental.user.grpc.LoginUserResponse>(
                service, METHODID_LOGIN_USER)))
        .addMethod(
          getUploadUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.carrental.user.grpc.UploadUsersRequest,
              com.carrental.user.grpc.UploadUsersResponse>(
                service, METHODID_UPLOAD_USERS)))
        .addMethod(
          getGetLoginHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.carrental.user.grpc.GetLoginHistoryRequest,
              com.carrental.user.grpc.GetLoginHistoryResponse>(
                service, METHODID_GET_LOGIN_HISTORY)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.carrental.user.grpc.UserServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getRegisterUserMethod())
              .addMethod(getLoginUserMethod())
              .addMethod(getUploadUsersMethod())
              .addMethod(getGetLoginHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
