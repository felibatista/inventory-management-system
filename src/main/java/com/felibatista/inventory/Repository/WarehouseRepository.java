package com.felibatista.inventory.repository;

import com.felibatista.inventory.entity.Warehouse;
import org.springframework.data.repository.CrudRepository;

public interface WarehouseRepository extends CrudRepository<Warehouse, Long>{
    Warehouse findById(long id);
}
