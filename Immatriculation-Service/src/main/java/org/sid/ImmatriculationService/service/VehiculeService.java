package org.sid.ImmatriculationService.service;

import org.sid.ImmatriculationService.dto.VehiculeRequestDTO;
import org.sid.ImmatriculationService.dto.VehiculeResponseDTO;


public interface VehiculeService {
    public VehiculeResponseDTO getVehiculeById( Integer id);
    public VehiculeResponseDTO addVehicule(VehiculeRequestDTO vehiculeRequestDTO);
    public VehiculeResponseDTO updateVehicule(Integer id,VehiculeRequestDTO vehiculeRequestDTO);
    public void deleteVehicule(Integer id);


}
