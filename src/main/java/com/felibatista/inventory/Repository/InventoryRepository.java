package com.felibatista.inventory.repository;

import com.felibatista.inventory.entity.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, Long> {
    Inventory findById(long id);
}
