package com.felibatista.inventory.repository;

import com.felibatista.inventory.entity.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LocationRepository extends CrudRepository<Location, Long> {
    Optional<Location> findById(long id);
}
