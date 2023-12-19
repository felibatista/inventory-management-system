package com.felibatista.inventory.repository;

import com.felibatista.inventory.entity.Delivery;
import com.felibatista.inventory.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OrderRepository extends CrudRepository<Order, Long> {
    Optional<Order> findById(long id);
}
