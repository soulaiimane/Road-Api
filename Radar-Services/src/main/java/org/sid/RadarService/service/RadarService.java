package org.sid.RadarService.service;

import org.sid.RadarService.dto.RadarRequestDTO;
import org.sid.RadarService.dto.RadarResponseDTO;

public interface RadarService {
    public RadarResponseDTO getRadarById(Integer id);
    public RadarResponseDTO addRadar(RadarRequestDTO radarRequestDTO);
    public RadarResponseDTO updateRadar(Integer id,RadarRequestDTO radarRequestDTO);
    public void deleteRadar(Integer id);

}
