package com.felibatista.inventory.service;

import com.felibatista.inventory.entity.Product;
import com.felibatista.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public Set<Product> getByPage(int page, int size){
        return getProductRepository().findAll().stream().skip((long) (page -1 ) * size).limit(size).collect(Collectors.toSet());
    }
}
