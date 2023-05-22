package org.sid.ImmatriculationService.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.sid.ImmatriculationService.dto.VehiculeRequestDTO;
import org.sid.ImmatriculationService.dto.VehiculeResponseDTO;
import org.sid.ImmatriculationService.entities.Vehicule;
import org.sid.ImmatriculationService.repositories.VehiculeRepository;
import org.sid.ImmatriculationService.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@WebService(serviceName = "VehiculeWS")
public class VehiculeSoapController {
    @Autowired
    VehiculeRepository vehiculeRepository;
    @Autowired
    VehiculeService vehiculeService;

    @WebMethod
    public List<Vehicule> vehiculeList(){
        return vehiculeRepository.findAll();
    }
    @WebMethod
    public VehiculeResponseDTO getVehiculeById(@WebParam(name ="id" ) Integer id){
       return vehiculeService.getVehiculeById(id);
    }
    @WebMethod
    public VehiculeResponseDTO updateVehicule( @WebParam(name ="id" ) Integer id,  @WebParam(name ="vehiculeRequestDTO" ) VehiculeRequestDTO vehiculeRequestDTO){
        return vehiculeService.updateVehicule(id,vehiculeRequestDTO);
    }
    @WebMethod
    public VehiculeResponseDTO addVehicule(  @WebParam(name ="vehiculeRequestDTO" ) VehiculeRequestDTO vehiculeRequestDTO){
        return vehiculeService.addVehicule(vehiculeRequestDTO);
    }
    @WebMethod
    public Boolean deleteVehicule( @WebParam(name ="id" ) Integer id ){
        vehiculeService.deleteVehicule(id);
        return true;
    }
}
