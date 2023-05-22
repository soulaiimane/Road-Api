package org.sid.ImmatriculationService.grpc.stub;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Immatriculation.proto")
public final class ProprietaireServiceGrpc {

  private ProprietaireServiceGrpc() {}

  public static final String SERVICE_NAME = "ProprietaireService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaireid,
      org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaire> getGetProprietaireByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProprietaireById",
      requestType = org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaireid.class,
      responseType = org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaireid,
      org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaire> getGetProprietaireByIdMethod() {
    io.grpc.MethodDescriptor<org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaireid, org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaire> getGetProprietaireByIdMethod;
    if ((getGetProprietaireByIdMethod = ProprietaireServiceGrpc.getGetProprietaireByIdMethod) == null) {
      synchronized (ProprietaireServiceGrpc.class) {
        if ((getGetProprietaireByIdMethod = ProprietaireServiceGrpc.getGetProprietaireByIdMethod) == null) {
          ProprietaireServiceGrpc.getGetProprietaireByIdMethod = getGetProprietaireByIdMethod = 
              io.grpc.MethodDescriptor.<org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaireid, org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireService", "getProprietaireById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaireid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaire.getDefaultInstance()))
                  .setSchemaDescriptor(new ProprietaireServiceMethodDescriptorSupplier("getProprietaireById"))
                  .build();
          }
        }
     }
     return getGetProprietaireByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetProprietaireListReuest,
      org.sid.ImmatriculationService.grpc.stub.Immatriculation.ProprietaireListResponse> getGetProprietaireListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProprietaireList",
      requestType = org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetProprietaireListReuest.class,
      responseType = org.sid.ImmatriculationService.grpc.stub.Immatriculation.ProprietaireListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetProprietaireListReuest,
      org.sid.ImmatriculationService.grpc.stub.Immatriculation.ProprietaireListResponse> getGetProprietaireListMethod() {
    io.grpc.MethodDescriptor<org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetProprietaireListReuest, org.sid.ImmatriculationService.grpc.stub.Immatriculation.ProprietaireListResponse> getGetProprietaireListMethod;
    if ((getGetProprietaireListMethod = ProprietaireServiceGrpc.getGetProprietaireListMethod) == null) {
      synchronized (ProprietaireServiceGrpc.class) {
        if ((getGetProprietaireListMethod = ProprietaireServiceGrpc.getGetProprietaireListMethod) == null) {
          ProprietaireServiceGrpc.getGetProprietaireListMethod = getGetProprietaireListMethod = 
              io.grpc.MethodDescriptor.<org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetProprietaireListReuest, org.sid.ImmatriculationService.grpc.stub.Immatriculation.ProprietaireListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireService", "getProprietaireList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetProprietaireListReuest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.ImmatriculationService.grpc.stub.Immatriculation.ProprietaireListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProprietaireServiceMethodDescriptorSupplier("getProprietaireList"))
                  .build();
          }
        }
     }
     return getGetProprietaireListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProprietaireServiceStub newStub(io.grpc.Channel channel) {
    return new ProprietaireServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProprietaireServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProprietaireServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProprietaireServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProprietaireServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProprietaireServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProprietaireById(org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaireid request,
        io.grpc.stub.StreamObserver<org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaire> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireByIdMethod(), responseObserver);
    }

    /**
     */
    public void getProprietaireList(org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetProprietaireListReuest request,
        io.grpc.stub.StreamObserver<org.sid.ImmatriculationService.grpc.stub.Immatriculation.ProprietaireListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProprietaireByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaireid,
                org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaire>(
                  this, METHODID_GET_PROPRIETAIRE_BY_ID)))
          .addMethod(
            getGetProprietaireListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetProprietaireListReuest,
                org.sid.ImmatriculationService.grpc.stub.Immatriculation.ProprietaireListResponse>(
                  this, METHODID_GET_PROPRIETAIRE_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class ProprietaireServiceStub extends io.grpc.stub.AbstractStub<ProprietaireServiceStub> {
    private ProprietaireServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProprietaireServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProprietaireServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProprietaireServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProprietaireById(org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaireid request,
        io.grpc.stub.StreamObserver<org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaire> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProprietaireList(org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetProprietaireListReuest request,
        io.grpc.stub.StreamObserver<org.sid.ImmatriculationService.grpc.stub.Immatriculation.ProprietaireListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProprietaireServiceBlockingStub extends io.grpc.stub.AbstractStub<ProprietaireServiceBlockingStub> {
    private ProprietaireServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProprietaireServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProprietaireServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProprietaireServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaire getProprietaireById(org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaireid request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.ImmatriculationService.grpc.stub.Immatriculation.ProprietaireListResponse getProprietaireList(org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetProprietaireListReuest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProprietaireServiceFutureStub extends io.grpc.stub.AbstractStub<ProprietaireServiceFutureStub> {
    private ProprietaireServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProprietaireServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProprietaireServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProprietaireServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaire> getProprietaireById(
        org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaireid request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.ImmatriculationService.grpc.stub.Immatriculation.ProprietaireListResponse> getProprietaireList(
        org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetProprietaireListReuest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROPRIETAIRE_BY_ID = 0;
  private static final int METHODID_GET_PROPRIETAIRE_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProprietaireServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProprietaireServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROPRIETAIRE_BY_ID:
          serviceImpl.getProprietaireById((org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaireid) request,
              (io.grpc.stub.StreamObserver<org.sid.ImmatriculationService.grpc.stub.Immatriculation.Proprietaire>) responseObserver);
          break;
        case METHODID_GET_PROPRIETAIRE_LIST:
          serviceImpl.getProprietaireList((org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetProprietaireListReuest) request,
              (io.grpc.stub.StreamObserver<org.sid.ImmatriculationService.grpc.stub.Immatriculation.ProprietaireListResponse>) responseObserver);
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

  private static abstract class ProprietaireServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProprietaireServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sid.ImmatriculationService.grpc.stub.Immatriculation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProprietaireService");
    }
  }

  private static final class ProprietaireServiceFileDescriptorSupplier
      extends ProprietaireServiceBaseDescriptorSupplier {
    ProprietaireServiceFileDescriptorSupplier() {}
  }

  private static final class ProprietaireServiceMethodDescriptorSupplier
      extends ProprietaireServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProprietaireServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProprietaireServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProprietaireServiceFileDescriptorSupplier())
              .addMethod(getGetProprietaireByIdMethod())
              .addMethod(getGetProprietaireListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
