package org.sid.RadarService.web;
import org.sid.RadarService.dto.RadarRequestDTO;
import org.sid.RadarService.dto.RadarResponseDTO;
import org.sid.RadarService.entities.Radar;
import org.sid.RadarService.repositories.RadarRepository;
import org.sid.RadarService.service.RadarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RadarRestController {
RadarRepository radarRepository;
RadarService radarService;

    public RadarRestController(RadarRepository radarRepository, RadarService radarService) {
        this.radarRepository = radarRepository;
        this.radarService = radarService;
    }

    @GetMapping("/radars")
    public List<Radar> radarList(){
        return radarRepository.findAll();
    }
    @GetMapping("/radars/{id}")
    public RadarResponseDTO getRadarById(@PathVariable Integer id){
        return radarService.getRadarById(id);
    }
    @PutMapping("/radars/{id}")
    public RadarResponseDTO updateRadar(@PathVariable Integer id,@RequestBody RadarRequestDTO radarRequestDTO){
        return radarService.updateRadar(id,radarRequestDTO);
    }
    @PostMapping("/radars")
    public RadarResponseDTO addRadar(@RequestBody RadarRequestDTO radarRequestDTO){
        return radarService.addRadar(radarRequestDTO);
    }
    @DeleteMapping("/radars/{id}")
    public void deleteRadar(@PathVariable Integer id ){
        radarService.deleteRadar(id);
    }
}
