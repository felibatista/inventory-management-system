package com.felibatista.inventory.repository;

import com.felibatista.inventory.entity.DeliveryDetail;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryDetailRepository extends CrudRepository<DeliveryDetail, Long> {
    DeliveryDetail findById(long id);
}
