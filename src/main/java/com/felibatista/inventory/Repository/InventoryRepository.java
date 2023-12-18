package com.felibatista.inventory.Repository;

import com.felibatista.inventory.Entity.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, Long> {
    Inventory findById(long id);
}
