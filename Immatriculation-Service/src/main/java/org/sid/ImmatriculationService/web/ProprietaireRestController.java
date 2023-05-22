package org.sid.ImmatriculationService.web;

import org.sid.ImmatriculationService.dto.ProprietaireRequestDTO;
import org.sid.ImmatriculationService.dto.ProprietaireResponseDTO;
import org.sid.ImmatriculationService.entities.Proprietaire;
import org.sid.ImmatriculationService.repositories.ProprietaireRepository;
import org.sid.ImmatriculationService.service.ProprietaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProprietaireRestController {
    ProprietaireRepository proprietaireRepository;
    ProprietaireService proprietaireService;

    public ProprietaireRestController(ProprietaireRepository proprietaireRepository, ProprietaireService proprietaireService) {
        this.proprietaireRepository = proprietaireRepository;
        this.proprietaireService = proprietaireService;
    }

    @GetMapping("/proprietaires")
    public List<Proprietaire> proprietairesList(){
        return proprietaireRepository.findAll();
    }
    @GetMapping("/proprietaires/{id}")
    public ProprietaireResponseDTO getProprietaireById(@PathVariable Integer id){
        return proprietaireService.getProprietaireById(id);
    }
    @PutMapping("/proprietaires/{id}")
    public ProprietaireResponseDTO updateProprietaire(@PathVariable Integer id,@RequestBody ProprietaireRequestDTO proprietaireRequestDTO){
        return proprietaireService.updateProprietaire(id,proprietaireRequestDTO);
    }
    @PostMapping("/proprietaires")
    public ProprietaireResponseDTO addProprietaire(@RequestBody ProprietaireRequestDTO proprietaireRequestDTO){
        return proprietaireService.addProprietaire(proprietaireRequestDTO);
    }
    @DeleteMapping("/proprietaires/{id}")
    public void deleteproprietaire(@PathVariable Integer id ){
       proprietaireService.deleteProprietaire(id);
    }
    @GetMapping("/proprietaires/exist/{id}")
    public boolean ownerExists(@PathVariable("id") Integer id){
        return proprietaireRepository.existsById(id);
    }
}
