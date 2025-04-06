package com.bharath.abstraction.interface_example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<INotifier> notifiers = List.of(
                new EmailNotifier(),
                new SmsNotifier()
        // One more class which implements INotifier can be added in future...
        );

        for (INotifier notifier : notifiers) {
            notifier.sendNotification("Your order has been Shipped!");
        }

    }
}
