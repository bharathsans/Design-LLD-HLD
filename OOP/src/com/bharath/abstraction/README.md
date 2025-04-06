# Abstraction in Java

Abstraction is one of the four foundational pillars of Object-Oriented Programming (OOP). It enables developers to manage complexity by hiding unnecessary implementation details and exposing only the essential functionality.

## What is Abstraction?

Abstraction is the process of hiding the internal workings of a class while exposing only the operations that are relevant to the user. Think of it like driving a car—you use the steering wheel and pedals without needing to understand how the engine works.

## Ways to Achieve Abstraction in Java

There are two primary approaches:

1. **Interfaces**
   - Define what should be done, not how.
   - Ideal when you want to specify a contract that multiple, possibly unrelated, classes must implement.
   - **Example:** A notifier system where various types (Email, SMS, etc.) implement a common `INotifier` interface.

2. **Abstract Classes**
   - Provide a partial implementation along with abstract methods that force subclasses to define specific behaviors.
   - Useful when related classes share common logic and state.
   - **Example:** A payment processing system where an abstract `PaymentProcessor` defines common behavior, and subclasses like `CreditCardPayment` and `UpiPayment` implement specific details.

## Interface-Based Abstraction

**Use Case:** Notifier System  
An interface `INotifier` is defined to send notifications. Implementations like `EmailNotifier` and `SmsNotifier` adhere to this contract. The client code interacts only with the interface, not the concrete implementations.

**Interview Points:**
- Interfaces provide 100% abstraction.
- They promote loose coupling and enhance testability.
- They support the Dependency Inversion Principle (DIP) from the SOLID principles.

## Abstract Class-Based Abstraction

**Use Case:** Payment Processing System  
An abstract class `PaymentProcessor` outlines a common template for processing payments. It includes shared methods (e.g., `initiatePayment()`) and abstract methods (e.g., `authenticate()`, `completePayment()`) that subclasses like `CreditCardPayment` and `UpiPayment` must implement.

**Interview Points:**
- Abstract classes allow sharing of code and state among related classes.
- They provide partial abstraction by defining a template for behavior while enforcing specific implementations.
- Ideal for scenarios with a strong "is-a" relationship.

## Interface vs. Abstract Class – When to Use What

| Feature                   | Interface                              | Abstract Class                      |
|---------------------------|----------------------------------------|-------------------------------------|
| Multiple Inheritance      | Supported                              | Not supported (single inheritance)  |
| Code Reuse                | No shared implementation               | Can provide default behavior         |
| Fields                    | Only constants                         | Instance variables allowed           |
| Constructors              | Not allowed                            | Allowed                              |
| Use Case                  | Unrelated classes sharing a contract   | Related classes with shared logic    |

## Visual Summary

**Interface-Based Abstraction:**

    INotifier
       ↑
   ┌───┴────┐
   │        │
EmailNotifier  SmsNotifier

**Abstract Class-Based Abstraction:**

   PaymentProcessor (abstract)
       /           \
      /             \
CreditCardPayment   UpiPayment

## Interview Tips

- Explain how abstraction helps design testable, modular, and maintainable systems.
- Discuss why you might choose an interface over an abstract class (or vice versa) with concrete examples.
- Emphasize how abstraction supports SOLID principles, particularly the Dependency Inversion Principle (DIP) and Interface Segregation Principle (ISP).
- Use real-world analogies (like driving a car) to illustrate your points.

## Summary

Abstraction allows you to focus on "what an object does" rather than "how it does it." By using interfaces, you define pure contracts, while abstract classes let you share common behavior and state. Mastering these techniques is essential for building scalable, maintainable, and loosely coupled systems.

Next, you can move on to exploring other OOP pillars such as Encapsulation, Inheritance, and Polymorphism.
