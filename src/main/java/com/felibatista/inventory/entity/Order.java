package com.felibatista.inventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Order {
    public enum OrderStatus {
        PENDING,
        DELIVERED,
        CANCELLED
    }

    @Id
    private Long id;
    private Date date;
    private OrderStatus status;
    private String notes;
    @OneToMany
    private List<OrderDetail> deliveryDetails;

    public Order() {
    }

    public Order(Long id, Date date, OrderStatus status, String notes) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.notes = notes;
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

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<OrderDetail> getDeliveryDetails() {
        return deliveryDetails;
    }

    public void setDeliveryDetails(List<OrderDetail> deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order delivery = (Order) o;
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
                '}';
    }
}
