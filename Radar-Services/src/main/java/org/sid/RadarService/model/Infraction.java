package org.sid.RadarService.model;

import lombok.*;
import org.sid.RadarService.entities.Radar;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class Infraction {
    private Integer id;
    private Date dateInfra;
    private Integer radarID;
    private Integer vehiculeID;
    private Integer vitesseVehic;
    private Integer vitesseMaxRadar;
    private  Integer infractionPrice;
    private Vehicule vehicule;
    private Radar radar;
}
