package org.sid.ImmatriculationService.dto;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ImmatriculationService.entities.Proprietaire;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehiculeResponseDTO {
    private Integer Id;
    private String nom;
    private String matricule;
    private String marque ;
    private Integer puissFiscal;
    private  String modele;

    @ManyToOne
    private Proprietaire proprietaire;


}
