package org.sid.RadarService.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Proprietaire {
    private Integer Id;
    private String nom;
    private Date datecreat;
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    List<Vehicule> vehiculeList;

}
