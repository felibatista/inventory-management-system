package com.felibatista.inventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.*;

@Entity
public class DeliveryDetail {
    @Id
    private Long id;
    private Integer quantity;
    private Date expectDate;
    @OneToMany
    private Set<Product> products = new HashSet<>();

    public DeliveryDetail() {
    }

    public DeliveryDetail(Long id, Integer quantity, Date expectDate) {
        this.id = id;
        this.quantity = quantity;
        this.expectDate = expectDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getExpectDate() {
        return expectDate;
    }

    public void setExpectDate(Date expectDate) {
        this.expectDate = expectDate;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryDetail that = (DeliveryDetail) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "DeliveryDetail{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", expectDate=" + expectDate +
                ", products=" + products +
                '}';
    }
}
