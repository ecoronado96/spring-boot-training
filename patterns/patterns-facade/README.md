# patterns-facade

This module contains a didactic implementation of the **Facade Pattern** in Java, using a car rental management example.

---

## 📝 What is the Facade Pattern?

The Facade pattern is a structural design pattern that provides a unified interface to a set of interfaces in a subsystem, making it easier to use and reducing complexity for the client. It is useful when you want to simplify interactions with complex subsystems, such as in car rental management, payment processing, or inventory systems.

**Advantages:**
- Simplifies client interaction with complex subsystems.
- Promotes loose coupling between client and subsystems.
- Makes the codebase easier to maintain and extend.

**Disadvantages:**
- May introduce a single point of failure.
- Can hide important subsystem functionality.

---

## 📂 Module Structure

- `src/main/java/` → Facade implementation and example usage.
- `src/test/java/` → Facade unit tests (if any).

---

## 🚀 How to run the example?

1. Compile the module:
   ```bash
   mvn clean compile
   ```
2. Run the Main class to see the Facade in action:
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.facade.Main"
   ```

---

## 💡 Example Output

```
Car booked: Sedan for Alice
Payment processed for Alice: $100.0
Car reserved: Sedan
Car rental successful!
Car booked: SUV for Bob
Payment processed for Bob: $150.0
Car reserved: SUV
Car rental successful!
```

---

## 🧑‍💻 What does the example show?

- The client interacts only with the `CarRentalFacade`, which internally coordinates the booking, payment, and inventory services.
- The Facade hides the complexity of the subsystems, making the process of renting a car straightforward for the client.

---

## 🧪 How to test this module?

1. Run the tests:
   ```bash
   mvn test
   ```

---

## 📚 Additional Resources
- [Facade Pattern (Wikipedia)](https://en.wikipedia.org/wiki/Facade_pattern)
- [Facade Pattern (Refactoring Guru)](https://refactoring.guru/es/design-patterns/facade) — Detailed explanation and examples in Spanish from Refactoring Guru.
- [All Design Patterns (Refactoring Guru)](https://refactoring.guru/es/design-patterns) — Comprehensive resource for all design patterns in Spanish.
- [Spring Boot Facade Example (Baeldung)](https://www.baeldung.com/java-facade-pattern)

---

> This module is part of the [spring-boot-training](../..) repository.

---
This example demonstrates how the Facade pattern can be used to simplify a real-world scenario such as car rental management.
