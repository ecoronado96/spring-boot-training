package com.example.facade;

public class Main {
    public static void main(String[] args) {
        CarRentalFacade facade = new CarRentalFacade();
        // Example usage
        facade.rentCar("Sedan", "Alice", 100.0);
        facade.rentCar("SUV", "Bob", 150.0);
    }
}
