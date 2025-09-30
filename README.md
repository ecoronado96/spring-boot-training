# Spring Boot Training

This repository is a **hands-on training project** designed to learn and practice both **design patterns** and **Spring Boot** concepts step by step.  
It is structured as a **multi-module Maven project**, where each module focuses on a specific topic or exercise.  

---

## 📂 Project Structure

The repository is divided into two main sections:

- **patterns/** → Core design patterns implemented in Java.
- **spring/** → Progressive Spring Boot demos, from basics to advanced usage.

Example layout:

```plaintext
spring-boot-training/
├── patterns/
│ ├── patterns-singleton
│ ├── patterns-factory
│ └── patterns-facade
├── spring/
│ ├── spring-basic-demo
│ ├── spring-basic-demo-dto
│ └── spring-basic-demo-tests
└── pom.xml (parent)
```

---

## 🚀 Modules Overview

### Patterns
1. **patterns-singleton** → Implementation of the Singleton Pattern.  
2. **patterns-factory** → Implementation of the Factory Pattern.  
3. **patterns-facade** → Implementation of the Facade Pattern.  

### Spring Boot
1. **spring-basic-demo** → Minimal Spring Boot application with simple controllers and services.  
2. **spring-basic-demo-dto** → Adds DTOs, a facade layer, and MapStruct integration.
3. **spring-basic-demo-tests** → Demonstrates testing with Spring Boot (unit & integration).

---

## 🛠️ Tech Stack
- **Java 17**
- **Spring Boot 3.x**
- **MapStruct**
- **JUnit 5 / Mockito**
- **AssertJ**

---

## 📖 Usage

1. Clone the repository:
   ```bash
   git clone https://github.com/ecoronado96/spring-boot-training.git
   cd spring-boot-training
