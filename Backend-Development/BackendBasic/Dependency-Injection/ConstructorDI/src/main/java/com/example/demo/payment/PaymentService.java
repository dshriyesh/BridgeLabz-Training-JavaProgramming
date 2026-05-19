package com.example.demo.payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    // 1. Immutable dependency field
    private final PaymentGateway paymentGateway;

    // 2. Spring automatically injects the StripePaymentGateway bean here
    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void completeOrder(double total) {
        System.out.println("Starting order completion inside PaymentService...");
        paymentGateway.process(total);
    }
}