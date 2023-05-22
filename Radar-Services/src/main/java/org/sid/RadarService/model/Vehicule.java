package org.sid.RadarService.model;

import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Vehicule {
    private Integer Id;
    private String nom;
    private String matricule;
    private String marque ;
    private Integer puissFiscal;
    private  String modele;
    private Proprietaire proprietaire;
}
