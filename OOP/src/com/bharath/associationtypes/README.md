# Association vs Aggregation vs Composition in Java

Understanding relationships between classes is fundamental in object-oriented design. These relationships define how objects interact, how tightly they're coupled, and how their lifecycles are managed.

In Java, three common types of relationships are:

- Association
- Aggregation
- Composition

---

## 1. Association

### ✅ Definition

A relationship where all participating objects have their own lifecycle and there is **no ownership**. One object uses another, but they are **not dependent** on each other.

### 🧠 Real-World Analogy

A `Doctor` can treat a `Patient`. Both can exist independently of each other.

### 💡 Key Points

- No ownership
- Objects are loosely coupled
- Can be one-to-one, one-to-many, many-to-one, or many-to-many

### 💻 Code Snippet

```java
Doctor doctor = new Doctor("Dr. Smith", "Cardiology", null);
Patient patient = new Patient("John Doe", List.of(doctor));
```

- The `Doctor` and `Patient` are associated.
- Either can exist independently.
- The relationship is optional and non-owning.

---

## 2. Aggregation

### ✅ Definition

A specialized form of association where one object "has-a" another. However, the part can still exist **independently** of the whole.

### 🧠 Real-World Analogy

A `Hospital` has many `Doctors`. Doctors can work at multiple hospitals or exist independently.

### 💡 Key Points

- Has-a relationship
- Whole and part have **independent lifecycles**
- Represented with a **hollow diamond (◇)** in UML

### 💻 Code Snippet

```java
List<Doctor> doctors = List.of(new Doctor("Dr. Alice", "Neurology", null));
Hospital hospital = new Hospital("City Hospital", doctors);
```

- The `Hospital` aggregates `Doctor`s.
- The `Doctor` objects are passed into the `Hospital` constructor.
- The `Doctor`s can still exist if the `Hospital` is destroyed.

---

## 3. Composition

### ✅ Definition

A strong form of aggregation where the part **cannot exist** without the whole. The whole is responsible for the **creation and destruction** of the part.

### 🧠 Real-World Analogy

A `Library` contains `Book`s. If the `Library` is destroyed, its `Book`s also cease to exist.

### 💡 Key Points

- Strong ownership
- The part **cannot exist** independently of the whole
- Represented with a **filled diamond (◆)** in UML

### 💻 Code Snippet

```java
Library library = new Library();
System.out.println(library.getBooks().get(0).getTitle());
```

- The `Library` creates and manages `Book` objects internally.
- `Book` instances are tied to the lifecycle of the `Library`.

---

## 📝 Summary Table

| Concept     | Ownership | Lifecycle Dependency | UML Symbol       | Real-World Example |
| ----------- | --------- | -------------------- | ---------------- | ------------------ |
| Association | ❌         | ❌                    | Line             | Doctor ↔ Patient   |
| Aggregation | ✅         | ❌                    | Hollow Diamond ◇ | Hospital → Doctors |
| Composition | ✅         | ✅                    | Filled Diamond ◆ | Library → Books    |

---

## 🧠 Interview Insights

- These relationships reflect how real-world entities interact.
- **Association** is the most basic; it simply models communication.
- **Aggregation** is ideal when the container should not tightly manage the lifecycle of the parts.
- **Composition** is preferred when parts should not outlive their parent.
- Remember the principle: **Favor Composition over Inheritance** — it's a core principle of effective object-oriented design.

---

## 🔁 Quick Definitions Recap

- **Association**: Loosely coupled relationship with no ownership.
- **Aggregation**: Has-a relationship where the part can outlive the whole.
- **Composition**: Has-a relationship where the part’s lifecycle is managed by the whole.

---

✅ **Next Steps**:\
Try building more examples of each and think about how object lifecycles impact your design. Interviewers love real-world modeling questions like these!

