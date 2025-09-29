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
- **patterns-singleton** → Implementation of the Singleton Pattern.  
- **patterns-factory** → Implementation of the Factory Pattern.  
- **patterns-facade** → Implementation of the Facade Pattern.  

### Spring Boot
- **spring-basic-demo** → Minimal Spring Boot application with simple controllers and services.  
- **spring-basic-demo-dto** → Adds DTOs, a facade layer, and MapStruct integration.  
- **spring-basic-demo-tests** → Demonstrates testing with Spring Boot (unit & integration).  

---

## 🛠️ Tech Stack
- **Java 21**
- **Spring Boot 3.x**
- **Spring Cloud (optional, future exercises)**
- **MapStruct**
- **JUnit 5 / Mockito**

---

## 📖 Usage

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/spring-boot-training.git
   cd spring-boot-training
