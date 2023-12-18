package com.felibatista.inventory.Repository;

import com.felibatista.inventory.Entity.Delivery;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryRepository extends CrudRepository<Delivery, Long> {
    Delivery findById(long id);
}
