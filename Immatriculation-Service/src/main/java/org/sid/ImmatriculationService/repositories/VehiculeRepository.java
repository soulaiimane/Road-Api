package org.sid.ImmatriculationService.repositories;

import org.sid.ImmatriculationService.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VehiculeRepository extends JpaRepository<Vehicule,Integer> {
}
