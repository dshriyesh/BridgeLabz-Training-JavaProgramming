package com.example.demo.payment;

import org.springframework.stereotype.Component;

@Component
public class StripePaymentGateway implements PaymentGateway {
    @Override
    public void process(double amount) {
        System.out.println("Processing $" + amount + " securely via Stripe.");
    }
}