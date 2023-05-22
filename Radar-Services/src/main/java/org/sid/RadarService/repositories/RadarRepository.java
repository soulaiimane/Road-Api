package org.sid.RadarService.repositories;
import org.sid.RadarService.entities.Radar;
import org.sid.RadarService.model.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface RadarRepository extends JpaRepository<Radar,Integer> {
}
