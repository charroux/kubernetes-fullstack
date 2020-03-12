package com.example.webService;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    long id;
    String plateNumber;

    public Car() {
    }

    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
