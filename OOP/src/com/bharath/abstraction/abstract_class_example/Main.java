package com.bharath.abstraction.abstract_class_example;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardPayment();
        PaymentProcessor upiProcessor = new UpiPayment();

        System.out.println("Processing credit card payment:");
        creditCardProcessor.initiatePayment(500.0);
        creditCardProcessor.authenticate();
        creditCardProcessor.completePayment();

        System.out.println("-----");

        System.out.println("Processing UPI payment:");
        upiProcessor.initiatePayment(300.0);
        upiProcessor.authenticate();
        upiProcessor.completePayment();

        System.out.println("-----");

        // Differentiating object types at runtime
        if (creditCardProcessor instanceof CreditCardPayment) {
            System.out.println("creditCardProcessor is an instance of CreditCardPayment");
        }

        if (upiProcessor instanceof UpiPayment) {
            System.out.println("upiProcessor is an instance of UpiPayment");
        }
    }
}
