package com.bharath.abstraction.abstract_class_example;

public class UpiPayment extends PaymentProcessor {

    @Override
    public void authenticate() {
        System.out.println("Authenticating for UPI");
    }

    @Override
    public void completePayment() {
        System.out.println("UPI payment completed");
    }
}
