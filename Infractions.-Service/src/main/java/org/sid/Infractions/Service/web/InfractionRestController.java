package org.sid.Infractions.Service.web;

import org.sid.Infractions.Service.dto.InfractionRequestDTO;
import org.sid.Infractions.Service.dto.InfractionResponseDTO;
import org.sid.Infractions.Service.entities.Infraction;
import org.sid.Infractions.Service.repositories.InfractionRepository;
import org.sid.Infractions.Service.service.InfractionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InfractionRestController {
InfractionRepository infractionRepository;
InfractionService infractionService;

    public InfractionRestController(InfractionRepository infractionRepository, InfractionService infractionService) {
        this.infractionRepository = infractionRepository;
        this.infractionService = infractionService;
    }
    @GetMapping("/infractions")
    public List<Infraction> infractionList(){
        return infractionRepository.findAll();
    }
    @GetMapping("/infractions/{id}")
    public InfractionResponseDTO getInfractionById(@PathVariable Integer id){
        return infractionService.getInfractionById(id);
    }
    @PutMapping("/infractions/{id}")
    public InfractionResponseDTO updateInfraction(@PathVariable Integer id,@RequestBody InfractionRequestDTO infractionRequestDTO){
        return infractionService.updateInfraction(id,infractionRequestDTO);
    }
    @PostMapping("/infractions")
    public InfractionResponseDTO addInfraction(@RequestBody InfractionRequestDTO infractionRequestDTO){
        return infractionService.addInfraction(infractionRequestDTO);
    }
    @DeleteMapping("/infractions/{id}")
    public void deleteInfractions(@PathVariable Integer id ){
        infractionService.deleteInfraction(id);
    }
}
