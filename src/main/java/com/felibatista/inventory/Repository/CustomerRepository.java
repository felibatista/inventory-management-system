package com.felibatista.inventory.Repository;

import com.felibatista.inventory.Entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findByName(String name);
    Customer findById(long id);
}
