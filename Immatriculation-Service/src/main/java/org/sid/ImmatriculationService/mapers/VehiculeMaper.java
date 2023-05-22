package org.sid.ImmatriculationService.mapers;

import org.sid.ImmatriculationService.dto.VehiculeRequestDTO;
import org.sid.ImmatriculationService.dto.VehiculeResponseDTO;
import org.sid.ImmatriculationService.entities.Vehicule;
import org.sid.ImmatriculationService.repositories.VehiculeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class VehiculeMaper {
    VehiculeRepository vehiculeRepository;

    public VehiculeMaper(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    public VehiculeResponseDTO fromVehicule(Vehicule vehicule){
    VehiculeResponseDTO vehiculeResponseDTO=new VehiculeResponseDTO();
        BeanUtils.copyProperties(vehicule,vehiculeResponseDTO);
        return vehiculeResponseDTO;
    }
    public Vehicule fromRequest(VehiculeRequestDTO vehiculeRequestDTO){
        Vehicule vehicule=new Vehicule();
        BeanUtils.copyProperties(vehiculeRequestDTO,vehicule);
        return vehicule;
    }
    public Vehicule fromRequestByid(Integer id,VehiculeRequestDTO vehiculeRequestDTO){
        Vehicule vehicule=vehiculeRepository.findById(id).orElseThrow(()->
                new RuntimeException(String.format("Account %s not found",id)));
        BeanUtils.copyProperties(vehiculeRequestDTO,vehicule);
        return vehicule;
    }

}
