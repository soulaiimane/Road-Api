package org.sid.ImmatriculationService.service;

import org.sid.ImmatriculationService.dto.VehiculeRequestDTO;
import org.sid.ImmatriculationService.dto.VehiculeResponseDTO;
import org.sid.ImmatriculationService.entities.Vehicule;
import org.sid.ImmatriculationService.mapers.VehiculeMaper;
import org.sid.ImmatriculationService.repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Service
@Transactional
public class VehiculeServiceImpl implements VehiculeService {
    Random random=new Random();
    @Autowired
    VehiculeRepository vehiculeRepository;
    @Autowired
    VehiculeMaper vehiculeMaper;


    @Override
    public VehiculeResponseDTO getVehiculeById(Integer id) {
       Vehicule vehicule= vehiculeRepository.findById(id).orElseThrow(()
               ->new RuntimeException(String.format("Account %s not found",id)));
        VehiculeResponseDTO vehiculeResponseDTO = vehiculeMaper.fromVehicule(vehicule);
        return vehiculeResponseDTO;
    }

    @Override
    public VehiculeResponseDTO addVehicule(VehiculeRequestDTO vehiculeRequestDTO) {
        Vehicule vehicule= vehiculeMaper.fromRequest(vehiculeRequestDTO);
       Vehicule saveVehicule = vehiculeRepository.save(vehicule);
       VehiculeResponseDTO dtoVehicule=vehiculeMaper.fromVehicule(saveVehicule);
        return dtoVehicule ;
    }

    @Override
    public VehiculeResponseDTO updateVehicule(Integer id, VehiculeRequestDTO vehiculeRequestDTO) {
        Vehicule vehicule = vehiculeMaper.fromRequestByid(id, vehiculeRequestDTO);
        Vehicule saveVehicule = vehiculeRepository.save(vehicule);
        VehiculeResponseDTO vehiculeResponseDTO=vehiculeMaper.fromVehicule(saveVehicule);
        return vehiculeResponseDTO;
    }
    @Override
    public void deleteVehicule(Integer id) {
    vehiculeRepository.deleteById(id);
    }
}
