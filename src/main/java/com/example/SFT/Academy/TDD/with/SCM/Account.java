package com.example.SFT.Academy.TDD.with.SCM;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String number;
    private String type;
    private Double balance;
    private Double maintainingnalance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account() {
    }

    public Account(String name, String number, String type, Double balance, Double maintainingnalance) {
        this.name = name;
        this.number = number;
        this.type = type;
        this.balance = balance;
        this.maintainingnalance = maintainingnalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getMaintainingnalance() {
        return maintainingnalance;
    }

    public void setMaintainingnalance(Double maintainingnalance) {
        this.maintainingnalance = maintainingnalance;
    }
}
