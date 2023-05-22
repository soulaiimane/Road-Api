package org.sid.ImmatriculationService.web;

import org.sid.ImmatriculationService.dto.VehiculeRequestDTO;
import org.sid.ImmatriculationService.dto.VehiculeResponseDTO;
import org.sid.ImmatriculationService.entities.Vehicule;
import org.sid.ImmatriculationService.repositories.VehiculeRepository;
import org.sid.ImmatriculationService.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VehiculeGraphQLController {
    @Autowired
    VehiculeRepository vehiculeRepository;
    @Autowired
    VehiculeService vehiculeService;

    @QueryMapping
    public List<Vehicule> vehiculeList(){
        return vehiculeRepository.findAll();
    }
    @QueryMapping
    public VehiculeResponseDTO getVehiculeById(@Argument Integer id){
       return vehiculeService.getVehiculeById(id);
    }
    @MutationMapping
    public VehiculeResponseDTO updateVehicule(@Argument Integer id, @Argument VehiculeRequestDTO vehiculeRequestDTO){
        return vehiculeService.updateVehicule(id,vehiculeRequestDTO);
    }
    @MutationMapping
    public VehiculeResponseDTO addVehicule(@Argument VehiculeRequestDTO vehiculeRequestDTO){
        return vehiculeService.addVehicule(vehiculeRequestDTO);
    }
    @MutationMapping
    public Boolean deleteVehicule(@Argument Integer id ){
        vehiculeService.deleteVehicule(id);
        return true;
    }
}
