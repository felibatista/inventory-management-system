package com.felibatista.inventory;

import com.felibatista.inventory.entity.Product;
import com.felibatista.inventory.entity.Role;
import com.felibatista.inventory.repository.ProductRepository;
import com.felibatista.inventory.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryManagementSystemApplication {
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(InventoryManagementSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            //seed data in roles
            Role roleAdmin = new Role(Role.RoleType.ROLE_ADMIN);
            Role roleUser = new Role(Role.RoleType.ROLE_USER);

            roleRepository.save(roleAdmin);
            roleRepository.save(roleUser);

            System.out.println("Roles created");

            //seed dsta in product
            for (int i = 0; i < 30; i++) {
                Product product = new Product("Product " + i, "A" + i, 200.0);
                productRepository.save(product);
            }
        };
    }
}
