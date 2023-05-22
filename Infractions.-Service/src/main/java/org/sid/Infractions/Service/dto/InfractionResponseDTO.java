package org.sid.Infractions.Service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InfractionResponseDTO {
    private Integer id;
    private Date dateInfra;
    private Integer radarID;
    private Integer vehiculeID;
    private Integer vitesseVehic;
    private Integer vitesseMaxRadar;
    private  Float infractionPrice;
}
