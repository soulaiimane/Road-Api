package org.sid.Infractions.Service.service;

import org.sid.Infractions.Service.dto.InfractionRequestDTO;
import org.sid.Infractions.Service.dto.InfractionResponseDTO;
import org.sid.Infractions.Service.entities.Infraction;
import org.sid.Infractions.Service.mapers.InfractionMaper;
import org.sid.Infractions.Service.repositories.InfractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InfractionServiceImpl implements InfractionService {
    @Autowired
    InfractionMaper infractionMaper;
    @Autowired
    InfractionRepository infractionRepository;

    @Override
    public InfractionResponseDTO getInfractionById(Integer id) {
        Infraction infraction= infractionRepository.findById(id).orElseThrow(()
                ->new RuntimeException(String.format("Account %s not found",id)));
        InfractionResponseDTO infractionResponseDTO = infractionMaper.fromInfraction(infraction);
        return infractionResponseDTO;
    }

    @Override
    public InfractionResponseDTO addInfraction(InfractionRequestDTO infractionRequestDTO) {

        Infraction infraction = infractionMaper.fromRequest(infractionRequestDTO);
        Infraction saveInfarction = infractionRepository.save(infraction);
        InfractionResponseDTO dtoInfraction=infractionMaper.fromInfraction(saveInfarction);
        return dtoInfraction ;
    }

    @Override
    public InfractionResponseDTO updateInfraction(Integer id, InfractionRequestDTO infractionRequestDTO) {
        Infraction infraction = infractionMaper.fromRequestById(id, infractionRequestDTO);
        Infraction saveInfarction = infractionRepository.save(infraction);
        InfractionResponseDTO infractionResponseDTO=infractionMaper.fromInfraction(saveInfarction);
        return infractionResponseDTO;
    }

    @Override
    public void deleteInfraction(Integer id) {
        infractionRepository.deleteById(id);
    }
}
