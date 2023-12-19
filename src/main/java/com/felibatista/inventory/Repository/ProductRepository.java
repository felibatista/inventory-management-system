package com.felibatista.inventory.repository;

import com.felibatista.inventory.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Optional<Product> findById(long id);
    Optional<Product> findByName(String name);
    ArrayList<Product> findAll();
}
