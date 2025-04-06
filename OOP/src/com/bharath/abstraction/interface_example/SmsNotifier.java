package com.bharath.abstraction.interface_example;

public class SmsNotifier implements INotifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Secding SMS : " + message);
    }
}
