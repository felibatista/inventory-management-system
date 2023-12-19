package com.felibatista.inventory.Repository;

import com.felibatista.inventory.Entity.Warehouse;
import org.springframework.data.repository.CrudRepository;

public interface WarehouseRepository extends CrudRepository<Warehouse, Long>{
    Warehouse findById(long id);
}
