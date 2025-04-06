# 💡 Abstraction using Abstract Class (Java)

This module demonstrates **abstraction** in Java using an **abstract class**, modeled around a real-world **payment processing system**.

---

## 🧠 What is Abstraction??

Abstraction is one of the four foundational pillars of OOP (along with Encapsulation, Inheritance, and Polymorphism).

> It allows us to expose **only essential behavior** while **hiding implementation details**. In Java, abstraction can be achieved using either **abstract classes** or **interfaces**.

---

## ✅ Use Case: Payment Processing System

In this example, we simulate a system that processes payments through different methods — **Credit Card** and **UPI** — using an abstract class `PaymentProcessor`.

Each payment method shares a common structure, but implementation details vary (e.g., authentication logic), making it a perfect candidate for **abstraction using an abstract class**.

---

## 🧱 Class Structure

### `abstract class PaymentProcessor`
- Defines the **template** for payment flow:
  - `initiatePayment(double amount)`
  - `authenticate()` → **abstract**
  - `completePayment()`

### `class CreditCardPayment extends PaymentProcessor`
- Provides concrete implementation of `authenticate()` for credit cards.

### `class UpiPayment extends PaymentProcessor`
- Provides concrete implementation of `authenticate()` for UPI payments.

### `Main.java`
- Creates individual objects of `CreditCardPayment` and `UpiPayment`.
- Calls their methods via the **abstract class reference**.
- Uses `instanceof` checks to distinguish the type of object at runtime.

---

## 🔎 Why Abstract Class (and not Interface)?

| Feature                            | Abstract Class                        | Interface                           |
|------------------------------------|---------------------------------------|-------------------------------------|
| Allows method implementations      | ✅ Yes                                | 🚫 (before Java 8 only abstract)    |
| Can have state (fields)            | ✅ Yes                                | 🚫 (mostly static final constants)  |
| Suitable for "is-a" relationships  | ✅ Yes                                | ➖ Yes, but semantic is looser       |
| Multiple inheritance               | 🚫 No (single abstract class)         | ✅ Yes (multiple interfaces)         |

### ✅ When to use Abstract Class:
> Use when you want to **define a common base** with **default implementations** and **partial behavior** shared across subclasses.

---

## 🧪 How we differentiate objects at runtime?

We use the `instanceof` operator:

```java
if (creditCardProcessor instanceof CreditCardPayment) {
    System.out.println("It is a CreditCardPayment");
}
