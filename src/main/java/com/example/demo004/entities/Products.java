package com.example.demo004.entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity(name = "Products")
public class Products {
    @Id
    private Long id;
    private String drink_name;
    private String size;
    private Float price;

    public Products(){}

    public Products(Long id, String drink_name, String size, Float price) {
        this.id = id;
        this.drink_name = drink_name;
        this.size = size;
        this.price = price;
    }

    @javax.persistence.Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrink_name() {
        return drink_name;
    }

    public void setDrink_name(String drink_name) {
        this.drink_name = drink_name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
