package com.example.facade;


public class InventoryService {
    public boolean isAvailable(String carType) {
        // Simulated logic
        return true;
    }
    public void reserveCar(String carType) {
        System.out.println("Car reserved: " + carType);
    }
}