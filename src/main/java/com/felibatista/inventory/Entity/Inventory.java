package com.felibatista.inventory.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Inventory {
    @Id
    private Long id;
    private Integer quantityAvailable;
    private Integer quantityReserved;
    private Integer maximumStockQuantity;
    private Integer minimumStockQuantity;
    private Integer reorderQuantity;


    public Inventory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Integer quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Integer getQuantityReserved() {
        return quantityReserved;
    }

    public void setQuantityReserved(Integer quantityReserved) {
        this.quantityReserved = quantityReserved;
    }

    public Integer getMaximumStockQuantity() {
        return maximumStockQuantity;
    }

    public void setMaximumStockQuantity(Integer maximumStockQuantity) {
        this.maximumStockQuantity = maximumStockQuantity;
    }

    public Integer getMinimumStockQuantity() {
        return minimumStockQuantity;
    }

    public void setMinimumStockQuantity(Integer minimumStockQuantity) {
        this.minimumStockQuantity = minimumStockQuantity;
    }

    public Integer getReorderQuantity() {
        return reorderQuantity;
    }

    public void setReorderQuantity(Integer reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return Objects.equals(id, inventory.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", quantityAvailable=" + quantityAvailable +
                ", quantityReserved=" + quantityReserved +
                ", maximumStockQuantity=" + maximumStockQuantity +
                ", minimumStockQuantity=" + minimumStockQuantity +
                ", reorderQuantity=" + reorderQuantity +
                '}';
    }
}
