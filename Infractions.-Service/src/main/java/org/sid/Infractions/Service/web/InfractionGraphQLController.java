package org.sid.Infractions.Service.web;

import org.sid.Infractions.Service.dto.InfractionRequestDTO;
import org.sid.Infractions.Service.dto.InfractionResponseDTO;
import org.sid.Infractions.Service.entities.Infraction;
import org.sid.Infractions.Service.repositories.InfractionRepository;
import org.sid.Infractions.Service.service.InfractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class InfractionGraphQLController {
    @Autowired
    InfractionRepository infractionRepository;
    @Autowired
    InfractionService infractionService;
    @QueryMapping
    public List<Infraction> infractionList(){
        return infractionRepository.findAll();
    }
    @QueryMapping
    public InfractionResponseDTO getInfractionById(@Argument Integer id){
        return infractionService.getInfractionById(id);
    }
    @MutationMapping
    public InfractionResponseDTO updateInfraction(@Argument Integer id,@Argument InfractionRequestDTO infractionRequestDTO){
        return infractionService.updateInfraction(id,infractionRequestDTO);
    }
    @MutationMapping
    public InfractionResponseDTO addInfraction(@Argument InfractionRequestDTO infractionRequestDTO){
        return infractionService.addInfraction(infractionRequestDTO);
    }
    @MutationMapping
    public Boolean deleteInfractions(@Argument Integer id ){
        infractionService.deleteInfraction(id);
        return true;
    }
}
