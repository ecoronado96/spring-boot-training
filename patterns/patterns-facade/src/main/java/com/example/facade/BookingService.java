package com.example.facade;

public class BookingService {
    public void bookCar(String carType, String customer) {
        System.out.println("Car booked: " + carType + " for " + customer);
    }
}
