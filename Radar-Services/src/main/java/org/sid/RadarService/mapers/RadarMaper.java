package org.sid.RadarService.mapers;
import org.sid.RadarService.dto.RadarRequestDTO;
import org.sid.RadarService.dto.RadarResponseDTO;
import org.sid.RadarService.entities.Radar;
import org.sid.RadarService.repositories.RadarRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;


@Component
public class RadarMaper {
    RadarRepository radarRepository;

    public RadarMaper(RadarRepository radarRepository) {
        this.radarRepository = radarRepository;
    }

    public RadarResponseDTO fromRadar(Radar infraction){
        RadarResponseDTO radarResponseDTO=new RadarResponseDTO();
        BeanUtils.copyProperties(infraction,radarResponseDTO);
        return radarResponseDTO;
    }
    public Radar fromRequest(RadarRequestDTO radarRequestDTO){
        Radar radar=new Radar();
        BeanUtils.copyProperties(radarRequestDTO,radar);
        return radar;
    }
    public Radar fromRequestById(Integer id,RadarRequestDTO radarRequestDTO){
        Radar radar= radarRepository.findById(id).orElseThrow(()->
                new RuntimeException(String.format("Account %s not found",id)));
        BeanUtils.copyProperties(radarRequestDTO,radar);
        return radar;
    }

}
