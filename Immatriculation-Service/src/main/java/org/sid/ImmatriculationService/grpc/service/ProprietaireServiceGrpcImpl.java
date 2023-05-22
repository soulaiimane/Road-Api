package org.sid.ImmatriculationService.grpc.service;

import io.grpc.stub.StreamObserver;
import org.sid.ImmatriculationService.entities.Proprietaire;
import org.sid.ImmatriculationService.grpc.stub.Immatriculation;
import org.sid.ImmatriculationService.grpc.stub.ProprietaireServiceGrpc;
import org.sid.ImmatriculationService.repositories.ProprietaireRepository;
import org.sid.ImmatriculationService.service.ProprietaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProprietaireServiceGrpcImpl extends ProprietaireServiceGrpc.ProprietaireServiceImplBase {
    @Autowired
    ProprietaireService proprietaireService;
    @Autowired
    ProprietaireRepository proprietaireRepository;
    @Override
    public void getProprietaireList(Immatriculation.GetProprietaireListReuest request, StreamObserver<Immatriculation.ProprietaireListResponse> responseObserver) {
        proprietaireRepository.findAll();
    }

    @Override
    public void getProprietaireById(Immatriculation.Proprietaireid request, StreamObserver<Immatriculation.Proprietaire> responseObserver) {
        Integer id = request.getId();
        Proprietaire proprietaire = proprietaireRepository.findById(id).orElseThrow();
        Immatriculation.Proprietaire proprietaire1= Immatriculation.Proprietaire.newBuilder()
                .setId(proprietaire.getId())
                .setNom(proprietaire.getNom())
                .setEmail(proprietaire.getEmail())
                .build();
        responseObserver.onNext(proprietaire1);
        responseObserver.onCompleted();
    }
}
