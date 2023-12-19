package com.felibatista.inventory.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotBlank (message = "Product code is empty")
    @NotNull (message = "Product code is required")
    private String productCode;
    private String barCode;
    @NotBlank (message = "Name is empty")
    @NotNull (message = "Name is required")
    private String name;
    private String description;
    private String category;
    private Double packetWeight;
    private Double packetHeight;
    private Double packetWidth;
    private Double packetDepth;
    private boolean refrigerated;
    @Min(value = 0, message = "Price must be greater than 0")
    @NotNull (message = "Price is required")
    private Double price;
    @OneToMany
    private Set<Inventory> inventories = new HashSet<>();

    public Product() {
    }

    public Product(String productCode, String name, Double price){
        this.productCode = productCode;
        this.name = name;
        this.price = price;
    }

    public Product(String productCode, String barCode, String name, String description, String category, Double packetWeight, Double packetHeight, Double packetWidth, Double packetDepth, boolean refrigerated, Double price, Set<Inventory> inventories) {
        this.productCode = productCode;
        this.barCode = barCode;
        this.name = name;
        this.description = description;
        this.category = category;
        this.packetWeight = packetWeight;
        this.packetHeight = packetHeight;
        this.packetWidth = packetWidth;
        this.packetDepth = packetDepth;
        this.refrigerated = refrigerated;
        this.price = price;
        this.inventories = inventories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public Product(Long id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPacketWeight() {
        return packetWeight;
    }

    public void setPacketWeight(Double packetWeight) {
        this.packetWeight = packetWeight;
    }

    public Double getPacketHeight() {
        return packetHeight;
    }

    public void setPacketHeight(Double packetHeight) {
        this.packetHeight = packetHeight;
    }

    public Double getPacketWidth() {
        return packetWidth;
    }

    public void setPacketWidth(Double packetWidth) {
        this.packetWidth = packetWidth;
    }

    public Double getPacketDepth() {
        return packetDepth;
    }

    public void setPacketDepth(Double packetDepth) {
        this.packetDepth = packetDepth;
    }

    public boolean isRefrigerated() {
        return refrigerated;
    }

    public void setRefrigerated(boolean refrigerated) {
        this.refrigerated = refrigerated;
    }

    public Set<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(Set<Inventory> inventories) {
        this.inventories = inventories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(productCode, product.productCode) && Objects.equals(barCode, product.barCode);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", barCode='" + barCode + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", packetWeight=" + packetWeight +
                ", packetHeight=" + packetHeight +
                ", packetWidth=" + packetWidth +
                ", packetDepth=" + packetDepth +
                ", refrigerated=" + refrigerated +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productCode, barCode);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
