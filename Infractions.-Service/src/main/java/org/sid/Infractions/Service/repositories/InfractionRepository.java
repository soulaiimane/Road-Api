package org.sid.Infractions.Service.repositories;

import ch.qos.logback.core.joran.conditional.IfAction;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.sid.Infractions.Service.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InfractionRepository extends JpaRepository<Infraction,Integer> {
}
