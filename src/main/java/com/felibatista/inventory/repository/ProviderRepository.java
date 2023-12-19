package com.felibatista.inventory.repository;

import com.felibatista.inventory.entity.Provider;
import com.felibatista.inventory.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
    Provider findByName(String name);
    Provider findById(long id);
    Optional<Provider> findByEmail(String email);
    Boolean existsByEmail(String email);
}
