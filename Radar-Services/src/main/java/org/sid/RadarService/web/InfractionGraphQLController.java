package org.sid.RadarService.web;
import org.sid.RadarService.dto.RadarRequestDTO;
import org.sid.RadarService.dto.RadarResponseDTO;
import org.sid.RadarService.entities.Radar;
import org.sid.RadarService.repositories.RadarRepository;
import org.sid.RadarService.service.RadarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class InfractionGraphQLController {
    @Autowired
    RadarRepository radarRepository;
    @Autowired
    RadarService radarService;
    @QueryMapping
    public List<Radar> radarList(){
        return radarRepository.findAll();
    }
    @QueryMapping
    public RadarResponseDTO getRadarById(@Argument Integer id){
        return radarService.getRadarById(id);
    }
    @MutationMapping
    public RadarResponseDTO updateRadar(@Argument Integer id,@Argument RadarRequestDTO radarRequestDTO){
        return radarService.updateRadar(id,radarRequestDTO);
    }
    @MutationMapping
    public RadarResponseDTO addRadar(@Argument RadarRequestDTO radarRequestDTO){
        return radarService.addRadar(radarRequestDTO);
    }
    @MutationMapping
    public Boolean deleteRadar(@Argument Integer id ){
        radarService.deleteRadar(id);
        return true;
    }
}
