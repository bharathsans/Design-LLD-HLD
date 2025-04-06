package com.bharath.polymorphism;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PaymentMethod> methods = List.of(
                new CreditCardPayment(),
                new UPIPayment());

        for (PaymentMethod method : methods) {
            method.pay(1500.0); // Polymorphic call
        }
    }
}
