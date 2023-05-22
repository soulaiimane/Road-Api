package org.sid.RadarService.service;
import org.sid.RadarService.dto.RadarRequestDTO;
import org.sid.RadarService.dto.RadarResponseDTO;
import org.sid.RadarService.entities.Radar;
import org.sid.RadarService.mapers.RadarMaper;
import org.sid.RadarService.repositories.RadarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RadarServiceImpl implements RadarService {
    @Autowired
    RadarMaper radarMaper;
    @Autowired
    RadarRepository radarRepository;

    @Override
    public RadarResponseDTO getRadarById(Integer id) {
        Radar radar= radarRepository.findById(id).orElseThrow(()
                ->new RuntimeException(String.format("Account %s not found",id)));
        RadarResponseDTO radarResponseDTO = radarMaper.fromRadar(radar);
        return radarResponseDTO;
    }

    @Override
    public RadarResponseDTO addRadar(RadarRequestDTO radarRequestDTO) {
        Radar radar = radarMaper.fromRequest(radarRequestDTO);
        Radar saveRadar = radarRepository.save(radar);
        RadarResponseDTO dtoRadar=radarMaper.fromRadar(saveRadar);
        return dtoRadar ;
    }

    @Override
    public RadarResponseDTO updateRadar(Integer id, RadarRequestDTO radarRequestDTO) {
        Radar radar = radarMaper.fromRequestById(id, radarRequestDTO);
        Radar saveRadar = radarRepository.save(radar);
        RadarResponseDTO radarResponseDTO=radarMaper.fromRadar(saveRadar);
        return radarResponseDTO;
    }

    @Override
    public void deleteRadar(Integer id) {
        radarRepository.deleteById(id);
    }
}
