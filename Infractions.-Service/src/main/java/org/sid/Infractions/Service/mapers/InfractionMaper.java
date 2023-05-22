package org.sid.Infractions.Service.mapers;


import ch.qos.logback.core.joran.conditional.IfAction;
import org.sid.Infractions.Service.dto.InfractionRequestDTO;
import org.sid.Infractions.Service.dto.InfractionResponseDTO;
import org.sid.Infractions.Service.entities.Infraction;
import org.sid.Infractions.Service.repositories.InfractionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;


@Component
public class InfractionMaper {
    InfractionRepository infractionRepository;

    public InfractionMaper(InfractionRepository infractionRepository) {
        this.infractionRepository = infractionRepository;
    }
    public InfractionResponseDTO fromInfraction(Infraction infraction){
        InfractionResponseDTO infractionResponseDTO=new InfractionResponseDTO();
        BeanUtils.copyProperties(infraction,infractionResponseDTO);
        return infractionResponseDTO;
    }
    public Infraction fromRequest(InfractionRequestDTO infractionRequestDTO){
        Infraction infraction=new Infraction();
        BeanUtils.copyProperties(infractionRequestDTO,infraction);
        return infraction;
    }
    public Infraction fromRequestById(Integer id,InfractionRequestDTO infractionRequestDTO){
        Infraction infraction= infractionRepository.findById(id).orElseThrow(()->
                new RuntimeException(String.format("Account %s not found",id)));
        BeanUtils.copyProperties(infractionRequestDTO,infraction);
        return infraction;
    }

}
