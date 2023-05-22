package org.sid.Infractions.Service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class Infraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date dateInfra;
    private Integer radarID;
    private Integer vehiculeID;
    private Integer vitesseVehic;
    private Integer vitesseMaxRadar;
    private  Float infractionPrice;

}
