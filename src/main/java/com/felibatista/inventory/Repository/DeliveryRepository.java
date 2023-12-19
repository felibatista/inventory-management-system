package com.felibatista.inventory.repository;

import com.felibatista.inventory.entity.Delivery;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryRepository extends CrudRepository<Delivery, Long> {
    Delivery findById(long id);
}
