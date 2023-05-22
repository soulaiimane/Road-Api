package org.sid.ImmatriculationService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehiculeRequestDTO {
    private String nom;
    private String marque ;
    private Integer puissFiscal;
    private  String modele;
}
