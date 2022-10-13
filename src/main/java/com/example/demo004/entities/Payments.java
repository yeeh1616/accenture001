package com.example.demo004.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Payments")
public class Payments {
    private Long id;
    private String user;
    private Float amount;

    public Float getOwe() {
        return owe;
    }

    public void setOwe(Float owe) {
        this.owe = owe;
    }

    private Float owe;

    public Payments() {}

    public Payments(String user, Float amount) {
        this.user = user;
        this.amount = amount;
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

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
