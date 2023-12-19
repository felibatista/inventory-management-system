package com.felibatista.inventory.repository;

import com.felibatista.inventory.entity.DeliveryDetail;
import com.felibatista.inventory.entity.Order;
import com.felibatista.inventory.entity.OrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, Long> {
    OrderDetail findById(long id);
}
