package com.felibatista.inventory.Repository;

import com.felibatista.inventory.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findByName(String name);
    Product findById(long id);
}
