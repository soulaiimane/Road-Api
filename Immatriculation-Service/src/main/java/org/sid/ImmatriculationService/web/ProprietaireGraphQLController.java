package org.sid.ImmatriculationService.web;

import org.sid.ImmatriculationService.dto.ProprietaireRequestDTO;
import org.sid.ImmatriculationService.dto.ProprietaireResponseDTO;
import org.sid.ImmatriculationService.entities.Proprietaire;
import org.sid.ImmatriculationService.repositories.ProprietaireRepository;
import org.sid.ImmatriculationService.service.ProprietaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProprietaireGraphQLController {
    @Autowired
    ProprietaireRepository proprietaireRepository;
    @Autowired
    ProprietaireService proprietaireService;
    @QueryMapping
    public List<Proprietaire> proprietaireList(){
        return proprietaireRepository.findAll();
    }
    @QueryMapping
    public ProprietaireResponseDTO getProprietaireById(@Argument Integer id){
        return proprietaireService.getProprietaireById(id);
    }
    @MutationMapping
    public ProprietaireResponseDTO updateProprietaire(@Argument Integer id, @Argument ProprietaireRequestDTO proprietaireRequestDTO){
        return proprietaireService.updateProprietaire(id,proprietaireRequestDTO);
    }
    @MutationMapping
    public ProprietaireResponseDTO addProprietaire(@Argument ProprietaireRequestDTO proprietaireRequestDTO){
        return proprietaireService.addProprietaire(proprietaireRequestDTO);
    }
    @MutationMapping
    public Boolean deleteProprietaire(@Argument Integer id ){
        proprietaireService.deleteProprietaire(id);
        return true;
    }
}
