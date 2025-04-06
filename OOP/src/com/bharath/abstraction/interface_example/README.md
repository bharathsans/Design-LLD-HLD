# 🔍 Abstraction using Interface in Java — Notification System Example

This module demonstrates **abstraction** using Java interfaces with a practical, real-world scenario: a notification system that supports multiple types of delivery methods like Email and SMS.

---

## 🧠 Core OOP Principle: Abstraction

**Abstraction** is one of the four fundamental principles of Object-Oriented Programming (OOP). It refers to exposing only the **essential functionalities** of an object while hiding the internal implementation details.

> 📌 Example Analogy: You drive a car using the steering wheel and pedals, without needing to understand how the engine, transmission, or braking system works internally.

---

## 🧩 Why Use Interfaces for Abstraction?

Java interfaces are a **contract-first** approach to design. They are useful when:

- You want to enforce a specific method signature without caring how it's implemented.
- You expect **multiple unrelated classes** to follow the same behavior.
- You want to enable **dependency injection, polymorphism**, or **loose coupling**.
- You are following the **SOLID principles**, especially the "D" — Dependency Inversion Principle.

---

## ✅ Real-World Use Case: Notification System

In a scalable notification system, we often need to support multiple channels:
- Email
- SMS
- Push Notifications
- WhatsApp
- Slack

Each of these may have different logic or third-party integration, but the **external behavior** (i.e., send a message) remains the same.

That’s where interfaces come in — we define a common contract that all notification types must adhere to.

---

## 🧠 Interface in Action: Design Overview

- `INotifier` is an interface that declares a method: `sendNotification(String message)`.
- `EmailNotifier` and `SmsNotifier` are two classes that implement this interface.
- The `Main` class acts as a client, which uses a **list of INotifier objects** and doesn’t care how the notification is actually sent.

This means:
- The system is **extensible**: You can add `PushNotifier` tomorrow with zero changes to the `Main` class.
- The design follows the **Open/Closed Principle**: Open for extension, closed for modification.
- The client code is **decoupled** from the actual implementation.

---

## 💬 Interview-Relevant Talking Points

### 🔑 Advantages of Using Interface for Abstraction

| Concept | Explanation |
|--------|-------------|
| **Loose Coupling** | Clients depend only on the interface, not concrete classes. |
| **Scalability** | Easily extend the system with new notifier types. |
| **Testability** | You can mock `INotifier` in unit tests. |
| **Encapsulation** | The implementation logic is hidden behind the contract. |
| **Flexibility** | Ideal for implementing behavioral design patterns (e.g., Strategy, Observer). |

---

### ❓ Sample Interview Question

> **"How would you design a pluggable notification system in Java?"**

You should walk the interviewer through:
- Designing a common interface.
- Implementing each channel separately.
- Using polymorphism to call the same method on all channels.
- Optionally using a Factory or Dependency Injection to select implementation.

---

### 🔍 Interface vs Abstract Class: When to Use?

| Feature | Interface | Abstract Class |
|--------|-----------|----------------|
| Abstraction Level | Full abstraction (until Java 8+) | Partial abstraction |
| Method Implementation | Only method signatures (can have default methods in Java 8+) | Can contain method implementations |
| Multiple Inheritance | ✅ Supported | ❌ Not supported |
| Use Case | Unrelated classes, no shared state | Related classes, shared logic and fields |

---

## 🧪 Suggested Enhancements

For further mastery and interview depth:
- Add more notifier types (e.g., Slack, WhatsApp).
- Use a `NotifierFactory` to dynamically return the right implementation.
- Integrate with Spring and use **@Autowired** for dependency injection.
- Write unit tests using Mockito to mock the `INotifier` interface.
- Implement Strategy or Factory pattern using this base.

---

## 📘 Summary

- This project demonstrates **abstraction using interfaces**, one of the key OOP principles.
- You designed a clean, decoupled system where business logic is **independent** of the communication channel.
- You followed industry best practices: interface-based design, loose coupling, and SOLID principles.

---

## 🔜 What’s Next?

Move to the next section:  
📂 `abstractclassexample` — where you’ll see abstraction using **abstract classes** and compare use cases directly with this interface-based approach.

