package com.example.facade;

public class CarRentalFacade {
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final BookingService bookingService;

    public CarRentalFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.bookingService = new BookingService();
    }

    public boolean rentCar(String carType, String customer, double amount) {
        if (!inventoryService.isAvailable(carType)) {
            System.out.println("Car not available: " + carType);
            return false;
        }
        if (!paymentService.processPayment(customer, amount)) {
            System.out.println("Payment failed for: " + customer);
            return false;
        }
        bookingService.bookCar(carType, customer);
        inventoryService.reserveCar(carType);
        System.out.println("Car rental successful!");
        return true;
    }
}
