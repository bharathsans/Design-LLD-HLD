# Association vs Aggregation vs Composition in Java (OOP Concepts)

Understanding relationships between classes is key to designing maintainable and modular object-oriented systems. This example covers three core concepts in **object-oriented design**:

- **Association**
- **Aggregation**
- **Composition**

These are all ways of creating relationships between objects — but differ in strength and lifecycle dependency.

---

## 🔗 1. Association

> **"A basic relationship between two independent classes where one class uses another."**

- No ownership implied.
- Both classes can exist independently.
- Can be **one-to-one**, **one-to-many**, **many-to-one**, or **many-to-many**.

### ✅ Example:

- A `Doctor` treats `Patient`s.
- A `Patient` can consult multiple `Doctor`s.
- Both can exist without each other.


Doctor doc = new Doctor("Dr. Smith", "Cardiology", null);
Patient patient = new Patient("John Doe", Arrays.asList(doc));
🔄 2. Aggregation
"A specialized form of Association with a whole-part relationship where the part can exist independently."

Has-A relationship.

Represented with a hollow diamond (◇) in UML.

Lifecycle of the part is not tied to the whole.

✅ Example:
A Hospital has many Doctors.

A Doctor can exist outside a Hospital.

List<Doctor> doctors = Arrays.asList(new Doctor("Dr. Alice", "Neurology", null));
Hospital hospital = new Hospital("City Hospital", doctors);
🧱 3. Composition
"A stronger form of Aggregation with full ownership — if the whole is destroyed, so are the parts."

Represented with a filled diamond (◆) in UML.

Part cannot exist without the whole.

Strong lifecycle dependency.

✅ Example:
A Library creates and owns Books.

Books do not exist outside the Library.

Library library = new Library();
System.out.println(library.getBooks().get(0).getTitle());
In the code, Library instantiates the Book objects internally — enforcing tight coupling.

🧠 Interview Insights
Concept	Ownership	Lifecycle Dependency	UML Notation	Real-World Example
Association	No	Independent	Simple line	A teacher and a student
Aggregation	Yes	Independent	Hollow Diamond ◇	University and its professors
Composition	Yes	Dependent	Filled Diamond ◆	House and its rooms (no house = no rooms)
Always think in terms of lifecycle and ownership.

Composition is preferred when strong ownership and encapsulation are needed.

Use Aggregation when parts are shared or reused elsewhere.

Association is your default — it's the broadest category.

✅ Key Takeaways
These concepts help model real-world relationships in your system architecture.

Knowing the difference improves code readability, reuse, and maintainability.

It's a critical topic in system design interviews and low-level design rounds.