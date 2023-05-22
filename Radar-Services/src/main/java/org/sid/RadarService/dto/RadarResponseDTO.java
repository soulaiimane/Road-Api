package org.sid.RadarService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RadarResponseDTO {
    private  Integer id;
    private Integer vitesseMaxRadar;
    private Double longitude;
    private Double latitude;
}
