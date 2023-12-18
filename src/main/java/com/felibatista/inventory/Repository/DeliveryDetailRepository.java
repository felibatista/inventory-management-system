package com.felibatista.inventory.Repository;

import org.springframework.data.repository.CrudRepository;

public interface DeliveryDetailRepository extends CrudRepository<DeliveryDetailRepository, Long> {
    DeliveryDetailRepository findById(long id);
}
