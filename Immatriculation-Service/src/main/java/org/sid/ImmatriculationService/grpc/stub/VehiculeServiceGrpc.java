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
public final class VehiculeServiceGrpc {

  private VehiculeServiceGrpc() {}

  public static final String SERVICE_NAME = "VehiculeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeId,
      org.sid.ImmatriculationService.grpc.stub.Immatriculation.Vehicule> getGetVehiculeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehiculeById",
      requestType = org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeId.class,
      responseType = org.sid.ImmatriculationService.grpc.stub.Immatriculation.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeId,
      org.sid.ImmatriculationService.grpc.stub.Immatriculation.Vehicule> getGetVehiculeByIdMethod() {
    io.grpc.MethodDescriptor<org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeId, org.sid.ImmatriculationService.grpc.stub.Immatriculation.Vehicule> getGetVehiculeByIdMethod;
    if ((getGetVehiculeByIdMethod = VehiculeServiceGrpc.getGetVehiculeByIdMethod) == null) {
      synchronized (VehiculeServiceGrpc.class) {
        if ((getGetVehiculeByIdMethod = VehiculeServiceGrpc.getGetVehiculeByIdMethod) == null) {
          VehiculeServiceGrpc.getGetVehiculeByIdMethod = getGetVehiculeByIdMethod = 
              io.grpc.MethodDescriptor.<org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeId, org.sid.ImmatriculationService.grpc.stub.Immatriculation.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "VehiculeService", "getVehiculeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.ImmatriculationService.grpc.stub.Immatriculation.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new VehiculeServiceMethodDescriptorSupplier("getVehiculeById"))
                  .build();
          }
        }
     }
     return getGetVehiculeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetVehiculeListReuest,
      org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeListResponse> getGetVehiculeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehiculeList",
      requestType = org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetVehiculeListReuest.class,
      responseType = org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetVehiculeListReuest,
      org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeListResponse> getGetVehiculeListMethod() {
    io.grpc.MethodDescriptor<org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetVehiculeListReuest, org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeListResponse> getGetVehiculeListMethod;
    if ((getGetVehiculeListMethod = VehiculeServiceGrpc.getGetVehiculeListMethod) == null) {
      synchronized (VehiculeServiceGrpc.class) {
        if ((getGetVehiculeListMethod = VehiculeServiceGrpc.getGetVehiculeListMethod) == null) {
          VehiculeServiceGrpc.getGetVehiculeListMethod = getGetVehiculeListMethod = 
              io.grpc.MethodDescriptor.<org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetVehiculeListReuest, org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "VehiculeService", "getVehiculeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetVehiculeListReuest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VehiculeServiceMethodDescriptorSupplier("getVehiculeList"))
                  .build();
          }
        }
     }
     return getGetVehiculeListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VehiculeServiceStub newStub(io.grpc.Channel channel) {
    return new VehiculeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VehiculeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VehiculeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VehiculeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VehiculeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class VehiculeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVehiculeById(org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeId request,
        io.grpc.stub.StreamObserver<org.sid.ImmatriculationService.grpc.stub.Immatriculation.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeByIdMethod(), responseObserver);
    }

    /**
     */
    public void getVehiculeList(org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetVehiculeListReuest request,
        io.grpc.stub.StreamObserver<org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVehiculeByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeId,
                org.sid.ImmatriculationService.grpc.stub.Immatriculation.Vehicule>(
                  this, METHODID_GET_VEHICULE_BY_ID)))
          .addMethod(
            getGetVehiculeListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetVehiculeListReuest,
                org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeListResponse>(
                  this, METHODID_GET_VEHICULE_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class VehiculeServiceStub extends io.grpc.stub.AbstractStub<VehiculeServiceStub> {
    private VehiculeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VehiculeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VehiculeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VehiculeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVehiculeById(org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeId request,
        io.grpc.stub.StreamObserver<org.sid.ImmatriculationService.grpc.stub.Immatriculation.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehiculeList(org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetVehiculeListReuest request,
        io.grpc.stub.StreamObserver<org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VehiculeServiceBlockingStub extends io.grpc.stub.AbstractStub<VehiculeServiceBlockingStub> {
    private VehiculeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VehiculeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VehiculeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VehiculeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sid.ImmatriculationService.grpc.stub.Immatriculation.Vehicule getVehiculeById(org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeId request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeListResponse getVehiculeList(org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetVehiculeListReuest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VehiculeServiceFutureStub extends io.grpc.stub.AbstractStub<VehiculeServiceFutureStub> {
    private VehiculeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VehiculeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VehiculeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VehiculeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.ImmatriculationService.grpc.stub.Immatriculation.Vehicule> getVehiculeById(
        org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeListResponse> getVehiculeList(
        org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetVehiculeListReuest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VEHICULE_BY_ID = 0;
  private static final int METHODID_GET_VEHICULE_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VehiculeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VehiculeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VEHICULE_BY_ID:
          serviceImpl.getVehiculeById((org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeId) request,
              (io.grpc.stub.StreamObserver<org.sid.ImmatriculationService.grpc.stub.Immatriculation.Vehicule>) responseObserver);
          break;
        case METHODID_GET_VEHICULE_LIST:
          serviceImpl.getVehiculeList((org.sid.ImmatriculationService.grpc.stub.Immatriculation.GetVehiculeListReuest) request,
              (io.grpc.stub.StreamObserver<org.sid.ImmatriculationService.grpc.stub.Immatriculation.VehiculeListResponse>) responseObserver);
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

  private static abstract class VehiculeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VehiculeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sid.ImmatriculationService.grpc.stub.Immatriculation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VehiculeService");
    }
  }

  private static final class VehiculeServiceFileDescriptorSupplier
      extends VehiculeServiceBaseDescriptorSupplier {
    VehiculeServiceFileDescriptorSupplier() {}
  }

  private static final class VehiculeServiceMethodDescriptorSupplier
      extends VehiculeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VehiculeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VehiculeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VehiculeServiceFileDescriptorSupplier())
              .addMethod(getGetVehiculeByIdMethod())
              .addMethod(getGetVehiculeListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
