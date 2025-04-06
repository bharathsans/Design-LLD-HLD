# Encapsulation in Java

Encapsulation is one of the four fundamental OOP principles, alongside Abstraction, Inheritance, and Polymorphism. It refers to **bundling the data (variables)** and the **methods (functions)** that operate on the data into a single unit (class), while **restricting direct access** to some of the object's components.

---

## ✅ What is Encapsulation?

Encapsulation ensures that the internal representation of an object is **hidden from the outside**, and access is only provided through **public methods** (getters/setters or business logic methods). 

In Java, encapsulation is typically achieved using:
- `private` access modifier for fields
- `public` getters/setters or business methods for interaction

---

## 🏦 Real-World Use Case: Bank Account

A `BankAccount` class contains sensitive data like balance. We should prevent external code from modifying it directly to ensure data integrity.

### Key Aspects:
- Balance is marked `private` — cannot be accessed directly.
- Public methods `deposit()` and `withdraw()` control access to `balance` with validation logic.
- Read-only access to `balance` through `getBalance()`.

This helps in:
- Preventing unauthorized access/modification.
- Ensuring validation is enforced on all operations.
- Making the class easier to maintain and debug.

---

## 🔐 Code Breakdown

### `BankAccount.java`
```java
private double balance;
balance is encapsulated — hidden from the outside world.

java
Copy
Edit
public void deposit(double amount) { ... }
public void withdraw(double amount) { ... }
Controlled access to modify balance — includes validation.

java
Copy
Edit
public double getBalance() { return balance; }
Provides read-only access to the encapsulated field.

🚀 Why is Encapsulation Important?
Benefit	Explanation
Security	Data is hidden and access controlled through business logic
Flexibility & Maintainability	Internal implementation can change without affecting external code
Code Reusability	Well-encapsulated classes are more modular and reusable
Improved Debugging	Easier to trace where and how data changes
🧠 Interview Tips
Encapsulation protects internal state — this is data hiding.

Always use access modifiers (private, protected, etc.) effectively.

Encapsulation ≠ Getters and Setters only. Business logic methods (like withdraw()) can enforce better encapsulation.

You can encapsulate behavior too — think beyond fields.

📝 Conclusion
Encapsulation is all about protecting your object’s internal state and exposing only what’s necessary. This improves security, readability, and future-proofing.

In this example, even if business logic changes (e.g., new rules for withdrawal), we don’t need to change the external usage of the class — just update the method implementation inside the class.