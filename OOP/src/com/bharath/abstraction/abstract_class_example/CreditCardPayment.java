package com.bharath.abstraction.abstract_class_example;

public class CreditCardPayment extends PaymentProcessor {
    @Override
    public void authenticate() {
        System.out.println("Authenticating for credit card");
    }

    @Override
    public void completePayment() {
        System.out.println("Credit card payment completed");
    }
}
