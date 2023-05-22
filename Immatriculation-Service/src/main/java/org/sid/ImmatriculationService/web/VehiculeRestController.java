package org.sid.ImmatriculationService.web;

import org.sid.ImmatriculationService.dto.VehiculeRequestDTO;
import org.sid.ImmatriculationService.dto.VehiculeResponseDTO;
import org.sid.ImmatriculationService.entities.Vehicule;
import org.sid.ImmatriculationService.repositories.VehiculeRepository;
import org.sid.ImmatriculationService.service.VehiculeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VehiculeRestController {
    VehiculeRepository vehculeRepository;
    VehiculeServiceImpl vehiculeService;

    public VehiculeRestController(VehiculeRepository vehculeRepository, VehiculeServiceImpl vehiculeService) {
        this.vehculeRepository = vehculeRepository;
        this.vehiculeService = vehiculeService;
    }

    @GetMapping("/vehicules")
    public List<Vehicule> vehiculeList(){
            return vehculeRepository.findAll();
    }
    @GetMapping("/vehicules/{id}")
    public VehiculeResponseDTO getVehiculeById(@PathVariable Integer id){
     return vehiculeService.getVehiculeById(id);
    }
    @PutMapping("/vehicules/{id}")
    public VehiculeResponseDTO updateVehicule(@PathVariable Integer id,@RequestBody VehiculeRequestDTO vehiculeRequestDTO){
        return vehiculeService.updateVehicule(id,vehiculeRequestDTO);
    }
    @PostMapping("/vehicules")
    public VehiculeResponseDTO addVehicule(@RequestBody VehiculeRequestDTO vehiculeRequestDTO){
       return vehiculeService.addVehicule(vehiculeRequestDTO);
    }
    @DeleteMapping("/vehicules/{id}")
    public void deleteVehicule(@PathVariable Integer id ){
        vehiculeService.deleteVehicule(id);
    }
    @GetMapping("/vehicules/exist/{id}")
    public boolean vehicleExists(@PathVariable("id") Integer id){
        return vehculeRepository.existsById(id);
    }




}
