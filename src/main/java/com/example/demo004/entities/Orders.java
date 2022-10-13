package com.example.demo004.entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity(name = "Orders")
public class Orders {
    @Id
    private Long id;
    private String user;
    private String drink;
    private String size;

    public Orders() {}

    public Orders(Long id, String user, String drink, String size) {
        this.id = id;
        this.user = user;
        this.drink = drink;
        this.size = size;
    }

    public String getDrink() {
        return drink;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @javax.persistence.Id
    public Long getId() {
        return id;
    }
}
