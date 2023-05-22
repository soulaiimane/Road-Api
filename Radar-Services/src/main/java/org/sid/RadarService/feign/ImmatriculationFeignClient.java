package org.sid.RadarService.feign;

import org.sid.RadarService.model.Proprietaire;
import org.sid.RadarService.model.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "IMMATRICULATION-SERVICE")
public interface ImmatriculationFeignClient {
    @GetMapping("/api/proprietaires/{id}")
    Proprietaire proprietaireById(@PathVariable Integer id );
    @GetMapping("/api/proprietaires/exist/{id}")
    boolean isOwnerExistsById(@PathVariable("id") Integer id);
    @GetMapping("/api/vehicules/{id}")
    Vehicule vehiculeById(@PathVariable Integer id );
    @GetMapping("/api/vehicules/exist/{id}")
    boolean isVehicleExistsById(@PathVariable("id") Integer id);



}
