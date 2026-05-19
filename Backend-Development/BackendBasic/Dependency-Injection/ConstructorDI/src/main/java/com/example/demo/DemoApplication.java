package com.example.demo;

import com.example.demo.payment.PaymentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication // <-- This is the magic switch that starts Spring Boot
public class DemoApplication {

    public static void main(String[] args) {
        // This launches the Spring Container
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runOnStartup(PaymentService paymentService) {
        return args -> {
            System.out.println("\n------------------------------------------------");
            System.out.println("SPRING CONTEXT INITIALIZED SUCCESSFULLY!");

            // This triggers your service, which has the Stripe gateway injected into it
            paymentService.completeOrder(250.00);

            System.out.println("------------------------------------------------\n");
        };
    }
}