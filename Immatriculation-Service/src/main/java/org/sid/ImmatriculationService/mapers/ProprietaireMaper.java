package org.sid.ImmatriculationService.mapers;

import org.sid.ImmatriculationService.dto.ProprietaireRequestDTO;
import org.sid.ImmatriculationService.dto.ProprietaireResponseDTO;
import org.sid.ImmatriculationService.entities.Proprietaire;
import org.sid.ImmatriculationService.repositories.ProprietaireRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProprietaireMaper {
    ProprietaireRepository proprietaireRepository;

    public ProprietaireMaper(ProprietaireRepository proprietaireRepository) {
        this.proprietaireRepository = proprietaireRepository;
    }
    public ProprietaireResponseDTO fromProprietaire(Proprietaire proprietaire){
        ProprietaireResponseDTO proprietaireResponseDTO=new ProprietaireResponseDTO();
        BeanUtils.copyProperties(proprietaire,proprietaireResponseDTO);
        return proprietaireResponseDTO;
    }
    public Proprietaire fromRequest(ProprietaireRequestDTO proprietaireRequestDTO){
        Proprietaire proprietaire=new Proprietaire();
        BeanUtils.copyProperties(proprietaireRequestDTO,proprietaire);
        return proprietaire;
    }
    public Proprietaire fromRequestByid(Integer id,ProprietaireRequestDTO proprietaireRequestDTO){
        Proprietaire proprietaire=proprietaireRepository.findById(id).orElseThrow(()->
                new RuntimeException(String.format("Account %s not found",id)));
        BeanUtils.copyProperties(proprietaireRequestDTO,proprietaire);
        return proprietaire;
    }
}
