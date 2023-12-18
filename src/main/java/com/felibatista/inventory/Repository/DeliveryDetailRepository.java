package com.felibatista.inventory.Repository;

import com.felibatista.inventory.Entity.DeliveryDetail;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryDetailRepository extends CrudRepository<DeliveryDetail, Long> {
    DeliveryDetail findById(long id);
}
