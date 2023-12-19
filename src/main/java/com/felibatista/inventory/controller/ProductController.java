package com.felibatista.inventory.controller;

import com.felibatista.inventory.entity.Product;
import com.felibatista.inventory.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public ProductService getProductService() {
        return productService;
    }

    @GetMapping("/all")
    public Iterable<Product> findAll(@RequestParam(required = false, defaultValue = "0") String page,
                                     @RequestParam(required = false, defaultValue = "0") String size) {
        if (page != null && !page.equals("0")) {
            return getProductService().getByPage(Integer.parseInt(page), (size == null || size.equals("0")) ? 10 : Integer.parseInt(size));
        }
        return getProductService().getProductRepository().findAll();
    }

    @GetMapping("id/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        Optional<Product> product = getProductService().getProductRepository().findById(id);

        if (product.isEmpty()) {
            return ResponseEntity.badRequest().body("Product not found");
        }

        return ResponseEntity.ok(product);
    }

    @GetMapping("name/{name}")
    public ResponseEntity<?> findByName(@PathVariable String name) {
        Optional<Product> product = getProductService().getProductRepository().findByName(name);

        if (product.isEmpty()) {
            return ResponseEntity.badRequest().body("Product not found");
        }

        return ResponseEntity.ok(product);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Valid @RequestBody Product product) {
        return ResponseEntity.ok(getProductService().getProductRepository().save(product));
    }
}
