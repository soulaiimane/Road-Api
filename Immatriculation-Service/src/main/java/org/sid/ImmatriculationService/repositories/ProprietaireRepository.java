package org.sid.ImmatriculationService.repositories;

import org.sid.ImmatriculationService.entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProprietaireRepository extends JpaRepository<Proprietaire,Integer> {
}
