package org.sid.ImmatriculationService.entities;

import jakarta.persistence.*;
import lombok.*;
 @Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder @ToString

public class Vehicule {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String nom;
    private String matricule;
    private String marque ;
    private Integer puissFiscal;
    private  String modele;
    @ManyToOne
    private Proprietaire proprietaire;

}
