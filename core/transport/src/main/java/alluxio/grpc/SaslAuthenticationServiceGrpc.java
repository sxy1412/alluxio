package alluxio.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.0)",
    comments = "Source: grpc/sasl_server.proto")
public final class SaslAuthenticationServiceGrpc {

  private SaslAuthenticationServiceGrpc() {}

  public static final String SERVICE_NAME = "alluxio.grpc.sasl.SaslAuthenticationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.SaslMessage,
      alluxio.grpc.SaslMessage> getAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "authenticate",
      requestType = alluxio.grpc.SaslMessage.class,
      responseType = alluxio.grpc.SaslMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<alluxio.grpc.SaslMessage,
      alluxio.grpc.SaslMessage> getAuthenticateMethod() {
    io.grpc.MethodDescriptor<alluxio.grpc.SaslMessage, alluxio.grpc.SaslMessage> getAuthenticateMethod;
    if ((getAuthenticateMethod = SaslAuthenticationServiceGrpc.getAuthenticateMethod) == null) {
      synchronized (SaslAuthenticationServiceGrpc.class) {
        if ((getAuthenticateMethod = SaslAuthenticationServiceGrpc.getAuthenticateMethod) == null) {
          SaslAuthenticationServiceGrpc.getAuthenticateMethod = getAuthenticateMethod =
              io.grpc.MethodDescriptor.<alluxio.grpc.SaslMessage, alluxio.grpc.SaslMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "authenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.SaslMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.SaslMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SaslAuthenticationServiceMethodDescriptorSupplier("authenticate"))
              .build();
        }
      }
    }
    return getAuthenticateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SaslAuthenticationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SaslAuthenticationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SaslAuthenticationServiceStub>() {
        @java.lang.Override
        public SaslAuthenticationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SaslAuthenticationServiceStub(channel, callOptions);
        }
      };
    return SaslAuthenticationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SaslAuthenticationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SaslAuthenticationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SaslAuthenticationServiceBlockingStub>() {
        @java.lang.Override
        public SaslAuthenticationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SaslAuthenticationServiceBlockingStub(channel, callOptions);
        }
      };
    return SaslAuthenticationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SaslAuthenticationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SaslAuthenticationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SaslAuthenticationServiceFutureStub>() {
        @java.lang.Override
        public SaslAuthenticationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SaslAuthenticationServiceFutureStub(channel, callOptions);
        }
      };
    return SaslAuthenticationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SaslAuthenticationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     * Used to drive Sasl negotiation with clients.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<alluxio.grpc.SaslMessage> authenticate(
        io.grpc.stub.StreamObserver<alluxio.grpc.SaslMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getAuthenticateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthenticateMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                alluxio.grpc.SaslMessage,
                alluxio.grpc.SaslMessage>(
                  this, METHODID_AUTHENTICATE)))
          .build();
    }
  }

  /**
   */
  public static final class SaslAuthenticationServiceStub extends io.grpc.stub.AbstractAsyncStub<SaslAuthenticationServiceStub> {
    private SaslAuthenticationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SaslAuthenticationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SaslAuthenticationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Used to drive Sasl negotiation with clients.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<alluxio.grpc.SaslMessage> authenticate(
        io.grpc.stub.StreamObserver<alluxio.grpc.SaslMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SaslAuthenticationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SaslAuthenticationServiceBlockingStub> {
    private SaslAuthenticationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SaslAuthenticationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SaslAuthenticationServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class SaslAuthenticationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SaslAuthenticationServiceFutureStub> {
    private SaslAuthenticationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SaslAuthenticationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SaslAuthenticationServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_AUTHENTICATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SaslAuthenticationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SaslAuthenticationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHENTICATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.authenticate(
              (io.grpc.stub.StreamObserver<alluxio.grpc.SaslMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SaslAuthenticationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SaslAuthenticationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return alluxio.grpc.AuthenticationServerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SaslAuthenticationService");
    }
  }

  private static final class SaslAuthenticationServiceFileDescriptorSupplier
      extends SaslAuthenticationServiceBaseDescriptorSupplier {
    SaslAuthenticationServiceFileDescriptorSupplier() {}
  }

  private static final class SaslAuthenticationServiceMethodDescriptorSupplier
      extends SaslAuthenticationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SaslAuthenticationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SaslAuthenticationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SaslAuthenticationServiceFileDescriptorSupplier())
              .addMethod(getAuthenticateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
