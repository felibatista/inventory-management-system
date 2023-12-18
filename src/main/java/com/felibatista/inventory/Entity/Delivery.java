package com.felibatista.inventory.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Delivery {
    public enum Status {
        PENDING,
        DELIVERED,
        CANCELLED
    }

    @Id
    private Long id;
    private Date date;
    private Status status;
    private String notes;
    private Double discount;
    @OneToMany
    private List<DeliveryDetail> deliveryDetails;

    public Delivery() {
    }

    public Delivery(Long id, Date date, Status status, String notes, Double discount) {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
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

    public List<DeliveryDetail> getDeliveryDetails() {
        return deliveryDetails;
    }

    public void setDeliveryDetails(List<DeliveryDetail> deliveryDetails) {
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
