package com.bharath.abstraction.abstract_class_example;

public abstract class PaymentProcessor {

    // Concrete method - common to all payment types...
    public void initiatePayment(double amount) {

    }

    // Abstract - To be implemented by the subclasses
    public abstract void authenticate();

    public abstract void completePayment();
}
