package com.bharath.abstraction.interface_example;

public class EmailNotifier implements INotifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}
