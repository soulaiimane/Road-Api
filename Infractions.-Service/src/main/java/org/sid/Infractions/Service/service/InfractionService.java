package org.sid.Infractions.Service.service;

import org.sid.Infractions.Service.dto.InfractionRequestDTO;
import org.sid.Infractions.Service.dto.InfractionResponseDTO;

public interface InfractionService {
    public InfractionResponseDTO getInfractionById(Integer id);
    public InfractionResponseDTO addInfraction(InfractionRequestDTO infractionRequestDTO);
    public InfractionResponseDTO updateInfraction(Integer id,InfractionRequestDTO infractionRequestDTO);
    public void deleteInfraction(Integer id);

}
