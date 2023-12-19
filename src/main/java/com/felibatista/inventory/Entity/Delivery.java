package com.felibatista.inventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.*;

@Entity
public class Delivery {
    public enum DeliveryStatus {
        PENDING,
        DELIVERED,
        CANCELLED
    }

    @Id
    private Long id;
    private Date date;
    private DeliveryStatus status;
    private String notes;
    private Double discount;
    @OneToMany
    private Set<DeliveryDetail> deliveryDetails = new HashSet<>();

    public Delivery() {
    }

    public Delivery(Long id, Date date, DeliveryStatus status, String notes, Double discount) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.notes = notes;
        this.discount = discount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Set<DeliveryDetail> getDeliveryDetails() {
        return deliveryDetails;
    }

    public void setDeliveryDetails(Set<DeliveryDetail> deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return Objects.equals(id, delivery.id) && Objects.equals(date, delivery.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date);
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "id=" + id +
                ", date=" + date +
                ", status=" + status +
                ", notes='" + notes + '\'' +
                ", discount=" + discount +
                '}';
    }
}
