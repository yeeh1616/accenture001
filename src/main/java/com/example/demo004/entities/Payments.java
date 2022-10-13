package com.example.demo004.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Payments")
public class Payments {
    private Long id;
    private String user;
    private Float amount;

    public Payments() {}

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
