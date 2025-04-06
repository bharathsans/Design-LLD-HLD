# 🧬 Object-Oriented Programming – Inheritance

## 📖 What is Inheritance?

Inheritance is one of the four pillars of Object-Oriented Programming (OOP). It allows one class (child or subclass) to inherit fields and methods from another class (parent or superclass). This promotes **code reusability**, **logical hierarchy**, and **extensibility** in applications.

---

## 👨‍👩‍👦 Real-World Analogy

Think of a `Person`. A `Student` or an `Employee` is a specialized version of a person.  
They share common traits like `name` or `age` (inherited), but also have their own specific behaviors such as `study()` or `work()`.

---

## 💡 Use Case: Person-Based Inheritance

This example models:

- A base `Person` class with common properties
- An `Employee` subclass (inherits from `Person`)
- A `Manager` subclass (inherits from `Employee` – demonstrating **multilevel inheritance**)
- A `Student` subclass (inherits from `Person` – demonstrating **hierarchical inheritance**)

Each subclass adds its own specific attributes and behavior.

---

## 🏗️ Types of Inheritance Demonstrated

| Type                     | Example                               |
|--------------------------|---------------------------------------|
| Single Inheritance       | `Employee` extends `Person`           |
| Multilevel Inheritance   | `Manager` extends `Employee`          |
| Hierarchical Inheritance | `Employee`, `Student` extend `Person` |

> 🔔 Note: Java does **not support multiple inheritance with classes**, but it can be achieved using interfaces.

---

## 🧠 Interview-Ready Insights

### 🔹 Why Use Inheritance?

- Reuse common code across related classes
- Implement polymorphic behavior
- Establish "is-a" relationships between classes

### 🔹 Best Practices

- Prefer **composition** over inheritance when relationships are not strictly "is-a"
- Don’t overuse inheritance — it can lead to tight coupling
- Use `protected` for members you want subclasses to access, but not external classes

### 🔹 Java Inheritance Rules

- `extends` keyword is used
- A class can extend only one other class (single inheritance)
- All classes implicitly extend `Object` if no parent is specified
- Parent class constructors can be called using `super()`

---

## 🔍 Quick Revision Pointers

- ✅ Enables runtime polymorphism when methods are overridden
- ✅ Reduces duplication of shared logic
- ✅ Facilitates better system organization via class hierarchies
- ❌ Java supports single inheritance with classes only
- ✅ `super()` can be used to invoke parent constructors or methods

---

## 🛠️ Technical Highlights from Code

- `Person` includes basic fields and `introduce()` method.
- `Employee` adds `employeeId` and `work()`.
- `Manager` adds `teamSize` and `conductMeeting()`.
- `Student` includes `studentId` and `study()`.
- `Main` class instantiates each object and calls relevant methods to show inheritance in action.

---

> 💼 Pro Tip for Interviews: When asked about inheritance, support your answer with real-life analogies, briefly mention types, and if possible, suggest where you might use composition instead — that shows depth of understanding.
