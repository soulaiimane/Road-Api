package org.sid.ImmatriculationService.service;

import org.sid.ImmatriculationService.dto.ProprietaireRequestDTO;
import org.sid.ImmatriculationService.dto.ProprietaireResponseDTO;

public interface ProprietaireService {
    public ProprietaireResponseDTO getProprietaireById( Integer id);
    public ProprietaireResponseDTO addProprietaire(ProprietaireRequestDTO ProprietaireRequestDTO);
    public ProprietaireResponseDTO updateProprietaire(Integer id,ProprietaireRequestDTO ProprietaireRequestDTO);
    public void deleteProprietaire(Integer id);
}
