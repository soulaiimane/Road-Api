package org.sid.RadarService.entities;

import jakarta.persistence.*;
import lombok.*;
import org.sid.RadarService.model.Infraction;

import java.util.Collections;
import java.util.List;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Radar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private Integer vitesseMaxRadar;
    private Double longitude;
    private Double latitude;
    @Transient
    private List<Infraction> infractionList;
}
