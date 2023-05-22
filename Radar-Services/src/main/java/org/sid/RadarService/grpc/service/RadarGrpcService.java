package org.sid.RadarService.grpc.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.sid.RadarService.entities.Radar;
import org.sid.RadarService.feign.ImmatriculationFeignClient;
import org.sid.RadarService.feign.InfractionFeignClient;
import org.sid.RadarService.grpc.stub.RadarOuterClass;
import org.sid.RadarService.grpc.stub.RadarServiceGrpc;
import org.sid.RadarService.model.Infraction;
import org.sid.RadarService.model.Vehicule;
import org.sid.RadarService.repositories.RadarRepository;

import java.util.Date;
import java.util.Random;

@GrpcService
public class RadarGrpcService extends RadarServiceGrpc.RadarServiceImplBase {

    private final RadarRepository radarRepository;
    private final InfractionFeignClient infractionFeignClient;
    private final ImmatriculationFeignClient immatriculationFeignClient;

    public RadarGrpcService(RadarRepository radarRepository, InfractionFeignClient infractionFeignClient, ImmatriculationFeignClient immatriculationFeignClient) {
        this.radarRepository = radarRepository;
        this.infractionFeignClient = infractionFeignClient;
        this.immatriculationFeignClient = immatriculationFeignClient;
    }


    @Override
    public void detectInfraction(RadarOuterClass.DetectRequest request, StreamObserver<RadarOuterClass.Infraction> responseObserver) {
        Integer radarId = request.getRadarId();
        Integer vehicleId = request.getVehicleId();
        Integer vehicleSpeed = request.getVitesseVehic();
        Random random=new Random();

        if(radarRepository.existsById(radarId) && immatriculationFeignClient.isVehicleExistsById(vehicleId)){
            Radar radar = radarRepository.findById(radarId).get();
            Vehicule vehicle = immatriculationFeignClient.vehiculeById(vehicleId);
            if (vehicleSpeed > radar.getVitesseMaxRadar()){
                Infraction infraction = Infraction.builder()
                        .id(null)
                        .dateInfra(new Date())
                        .vitesseMaxRadar(radar.getVitesseMaxRadar())
                        .vitesseVehic(vehicleSpeed)
                        .vitesseMaxRadar( radar.getVitesseMaxRadar())
                        .radarID(radar.getId())
                        .infractionPrice(random.nextInt(102,300))
                        .vehiculeID(vehicle.getId())
                        .vehicule(vehicle)
                        .radar(radar)
                        .build();
                infraction = infractionFeignClient.saveInfraction(infraction);
                System.out.println(infraction);
                infraction.setVehicule(vehicle);
                infraction.setRadar(radar);

                RadarOuterClass.Infraction response = RadarOuterClass.Infraction.newBuilder()
                        .setId(infraction.getId())
                        .setVitesseVehic(infraction.getVitesseVehic())
                        .setVitesseMaxRadar(infraction.getVitesseMaxRadar())
                        .setInfractionPrice(infraction.getInfractionPrice())
                        .setRadarID(infraction.getRadarID())
                        .setVehiculeID(infraction.getVehiculeID())
                        .setVehicle(RadarOuterClass.Vehicle.newBuilder()
                                .setId(infraction.getVehicule().getId())
                                .setRegNumber(infraction.getVehicule().getMatricule())
                                .setBrand(infraction.getVehicule().getMarque())
                                .setModel(infraction.getVehicule().getModele())
                                .setProprietaire(RadarOuterClass.Proprietaire.newBuilder()
                        .setId(infraction.getVehicule().getProprietaire().getId())
                        .setName(infraction.getVehicule().getProprietaire().getNom())
                        .setBirthDate(infraction.getVehicule().getProprietaire().getDatecreat().toString())
                        .setEmail(infraction.getVehicule().getProprietaire().getEmail())
                        .build())
                        .build())
                        .setRadar(RadarOuterClass.Radar.newBuilder()
                        .setId(infraction.getRadar().getId())
                        .setLongitude(infraction.getRadar().getLongitude())
                        .setLatitude(infraction.getRadar().getLatitude())
                        .setVitesseMaxRadar(infraction.getRadar().getVitesseMaxRadar())
                        .build())
                        .build();

                responseObserver.onNext(response);
            }else System.out.println("vehicleSpeed < radar.getVitesseMaxRadar()");
        }
        else responseObserver.onNext(null);
        responseObserver.onCompleted();
    }
}
