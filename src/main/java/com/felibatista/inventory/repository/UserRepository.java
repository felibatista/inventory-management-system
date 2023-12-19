package com.felibatista.inventory.repository;

import com.felibatista.inventory.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    User findById(long id);
    Optional<User> findByEmail(String email);
    Boolean existsByEmail(String email);
}
