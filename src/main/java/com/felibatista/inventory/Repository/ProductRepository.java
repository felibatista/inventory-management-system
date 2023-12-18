package com.felibatista.inventory.Repository;

import com.felibatista.inventory.Entity.Inventory;
import com.felibatista.inventory.Entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findByName(String name);
    Product findById(long id);

    public default ArrayList<Product> findAllProducts() {
        ArrayList<Product> products = new ArrayList<>();
        for (Product product : this.findAll()) {
            products.add(product);
        }
        return products;
    }
}
