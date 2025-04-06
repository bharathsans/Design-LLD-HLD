package com.bharath.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Bharath", "1234567890", 5000.0);

        account.deposit(1000.0); // Valid deposit
        account.withdraw(2000.0); // Valid withdrawal
        account.withdraw(5000.0); // Invalid: Insufficient funds

        System.out.println("Final Balance: ₹" + account.getBalance());
    }
}
