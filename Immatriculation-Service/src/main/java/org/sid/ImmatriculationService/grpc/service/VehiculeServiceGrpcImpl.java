package org.sid.ImmatriculationService.grpc.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.sid.ImmatriculationService.entities.Vehicule;
import org.sid.ImmatriculationService.grpc.stub.Immatriculation;
import org.sid.ImmatriculationService.grpc.stub.VehiculeServiceGrpc;
import org.sid.ImmatriculationService.repositories.VehiculeRepository;
import org.sid.ImmatriculationService.service.VehiculeService;

@GrpcService
public class VehiculeServiceGrpcImpl extends VehiculeServiceGrpc.VehiculeServiceImplBase {
    VehiculeService vehiculeService;

    VehiculeRepository vehiculeRepository;
    public VehiculeServiceGrpcImpl(VehiculeService vehiculeService, VehiculeRepository vehiculeRepository) {
        this.vehiculeService = vehiculeService;
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public void getVehiculeList(Immatriculation.GetVehiculeListReuest request, StreamObserver<Immatriculation.VehiculeListResponse> responseObserver) {
        vehiculeRepository.findAll();

    }

    @Override
    public void getVehiculeById(Immatriculation.VehiculeId request, StreamObserver<Immatriculation.Vehicule> responseObserver) {
        Integer id = request.getId();

        Vehicule vehicule = vehiculeRepository.findById(id).orElseThrow();
         Immatriculation.Vehicule vehicule1= Immatriculation.Vehicule.newBuilder()
                .setId(vehicule.getId())
                .setMarque(vehicule.getMarque())
                .setModele(vehicule.getMarque())
                .setNom(vehicule.getNom())
                .setPuissFiscal(vehicule.getPuissFiscal())
                .build();
        responseObserver.onNext(vehicule1);
        responseObserver.onCompleted();
    }
}
