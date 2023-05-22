package org.sid.ImmatriculationService.service;

import org.sid.ImmatriculationService.dto.ProprietaireRequestDTO;
import org.sid.ImmatriculationService.dto.ProprietaireResponseDTO;
import org.sid.ImmatriculationService.dto.VehiculeResponseDTO;
import org.sid.ImmatriculationService.entities.Proprietaire;
import org.sid.ImmatriculationService.entities.Vehicule;
import org.sid.ImmatriculationService.mapers.ProprietaireMaper;
import org.sid.ImmatriculationService.repositories.ProprietaireRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProprietaireServiceImpl implements ProprietaireService{
    ProprietaireMaper proprietaireMaper;
    ProprietaireRepository proprietaireRepository;

    public ProprietaireServiceImpl(ProprietaireMaper proprietaireMaper, ProprietaireRepository proprietaireRepository) {
        this.proprietaireMaper = proprietaireMaper;
        this.proprietaireRepository = proprietaireRepository;
    }
    @Override
    public ProprietaireResponseDTO getProprietaireById(Integer id) {
        Proprietaire proprietaire= proprietaireRepository.findById(id).orElseThrow(()
                ->new RuntimeException(String.format("Account %s not found",id)));
        ProprietaireResponseDTO proprietaireResponseDTO = proprietaireMaper.fromProprietaire(proprietaire);
        return proprietaireResponseDTO;
    }
    @Override
    public ProprietaireResponseDTO addProprietaire(ProprietaireRequestDTO ProprietaireRequestDTO) {
        Proprietaire proprietaire= proprietaireMaper.fromRequest(ProprietaireRequestDTO);
        Proprietaire saveProprietaire = proprietaireRepository.save(proprietaire);
        ProprietaireResponseDTO dtoProprietaire=proprietaireMaper.fromProprietaire(saveProprietaire);
        return dtoProprietaire ;
    }

    @Override
    public ProprietaireResponseDTO updateProprietaire(Integer id, ProprietaireRequestDTO ProprietaireRequestDTO) {
        Proprietaire proprietaire = proprietaireMaper.fromRequestByid(id, ProprietaireRequestDTO);
        Proprietaire saveProprietaire = proprietaireRepository.save(proprietaire);
        ProprietaireResponseDTO proprietaireResponseDTO=proprietaireMaper.fromProprietaire(saveProprietaire);
        return proprietaireResponseDTO;
    }
    @Override
    public void deleteProprietaire(Integer id) {
        proprietaireRepository.deleteById(id);
    }

}
