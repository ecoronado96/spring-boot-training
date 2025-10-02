package com.example.facade;

public class PaymentService {
    public boolean processPayment(String customer, double amount) {
        // Simulated payment logic
        System.out.println("Payment processed for " + customer + ": $" + amount);
        return true;
    }
}
