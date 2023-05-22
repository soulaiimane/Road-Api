package org.sid.ImmatriculationService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProprietaireResponseDTO {
    private Integer Id;
    private String nom;
    private Date datecreat;
    private String email;
}
