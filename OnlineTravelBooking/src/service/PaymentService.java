package service;

public class PaymentService {

    public boolean processPayment(double amount, String method) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
            return false;
        }

        System.out.println("Processing payment of ₹" + amount + " via " + method + "...");
        // simulate success
        System.out.println("Payment successful!");
        return true;
    }
}
