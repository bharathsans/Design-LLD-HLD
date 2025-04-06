# 🧠 Polymorphism in Java

## ✅ What is Polymorphism?

**Polymorphism** allows objects of different classes to be treated as objects of a common super class. It enables **one interface** to be used for **many implementations**.

In Java, **runtime polymorphism** is mainly achieved via **method overriding**, while **compile-time polymorphism** is achieved via **method overloading**.

---

## 🔧 Real-World Example

Imagine we have different payment methods: `CreditCardPayment` and `UPIPayment`. Both implement a common behavior: `pay(double amount)`.

This allows the client code to simply call `pay()` without knowing the actual payment method used — this is **polymorphism in action**.

---

## 💡 Implementation Using Interface

```java
public interface Payment {
    void pay(double amount);
}

public class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

public class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

✅ Polymorphic Usage

Edit
public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment upi = new UPIPayment();

        creditCard.pay(1000.0);
        upi.pay(500.0);
    }
}
At runtime, the JVM resolves the pay() method based on the actual object type (CreditCardPayment, UPIPayment), not the reference type (Payment).

🔄 Can We Achieve Polymorphism Without Interfaces?
Yes! You can achieve polymorphism using abstract classes or even regular superclass-subclass relationships.

Here’s how:

👇 Abstract Class-Based Polymorphism


abstract class PaymentMethod {
    abstract void pay(double amount);
}

class CreditCardPayment extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class UPIPayment extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}
This also allows polymorphism:


PaymentMethod method = new CreditCardPayment(); // or new UPIPayment()
method.pay(300.0);
🔍 Interface vs Abstract Class for Polymorphism
Feature	Interface	Abstract Class
Multiple Inheritance	✅ Supports	❌ Not supported in Java
Default Implementations	✅ (Since Java 8)	✅
Can Have Constructors	❌	✅
Fields / State	Constants only	Instance variables allowed
Use Case	Behavior contract	Base class with shared logic
Polymorphism?	✅ Yes	✅ Yes
🧑‍💼 Interview Tip
💬 "Can you explain polymorphism in Java? Does it require interfaces?"

You can respond:

"Polymorphism can be achieved using both interfaces and base/abstract classes. Interfaces are best when you want to define a contract across unrelated classes, while abstract classes are useful when shared behavior is involved. Java uses dynamic method dispatch to resolve the correct method implementation at runtime, enabling runtime polymorphism."

✅ Key Takeaways

Polymorphism simplifies code and promotes loose coupling.

You don’t need to know the specific implementation of an object to use it.

Works via inheritance and method overriding.

Can be achieved using interfaces, abstract classes, or base classes.

