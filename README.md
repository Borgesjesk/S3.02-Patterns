# S3.02 - Design Patterns 🎨

## 📋 Description
Implementation of three fundamental design patterns in Java, each solving a different
category of real-world software problems. This project demonstrates how patterns
improve code flexibility, scalability and maintainability — without overengineering.

Each level covers one pattern family:
- **Creational** → controls how objects are created
- **Creational** → controls how families of objects are created
- **Behavioral** → controls how objects communicate

---

## 🧩 Patterns Implemented

### 🔒 Level 1 — Singleton Pattern
**Problem it solves:** Guarantees only ONE instance of a class exists across the entire app.

Built an `Undo` class that replicates the Ctrl+Z command history behavior. No matter
how many times you call `getInstance()`, you always get back the same shared history.

**Key concepts:** private constructor · static instance · `getInstance()` method · `Stack<String>`

**Example:**
```java
Undo undo = Undo.getInstance();
undo.addCommand("mkdir carpeta");
undo.addCommand("cd carpeta");
undo.showHistory(); // [mkdir carpeta, cd carpeta]
undo.undoCommand();
undo.showHistory(); // [mkdir carpeta]
```

---

### 🏭 Level 2 — Abstract Factory Pattern
**Problem it solves:** Creates families of related objects without hardcoding their concrete classes.

Built an international contact manager that formats addresses and phone numbers
according to each country's conventions. The client (`Contact`) never knows if it's
dealing with Spain or the USA — it just asks the factory and gets the right format back.

**Key concepts:** abstract factory · concrete factories · abstract products · concrete products · client

**Example:**
```java
ContactFactory spainFactory = new SpainContactFactory(
    "Carrer Major 34", "Barcelona", "08001", "623456789"
);
Contact contact = new Contact(spainFactory);
System.out.println(contact.toString());
// Address: Carrer Major 34, 08001 Barcelona | Phone: +34 623 45 67 89
```

---

### 🎭 Level 3 — Strategy Pattern
**Problem it solves:** Replaces complex if/else chains by encapsulating each algorithm
in its own class, making it easy to swap behavior at runtime.

Built a report generation service that supports 7 formats (CSV, JSON, XML, PDF, HTML,
Excel, Word). Adding a new format = adding one new class. No existing code touched.
Open/Closed Principle in action. ✅

**Key concepts:** strategy interface · concrete strategies · service class · runtime swapping

**Example:**
```java
ReportService service = new ReportService(new JsonReportStrategy());
service.generateReport("sales 2024");
// {"report": "sales 2024"}

service = new ReportService(new CsvReportStrategy());
service.generateReport("sales 2024");
// report, data: sales 2024
```

---

## 🏗️ Project Structure

```
src/
├── main/java/
│   ├── singletonpattern/
│   │   └── Undo.java
│   ├── abstractfactorypattern/
│   │   ├── abstractfactory/      → ContactFactory
│   │   ├── abstractproduct/      → Address, Phone
│   │   ├── client/               → Contact
│   │   ├── concretefactory/      → SpainContactFactory, USAContactFactory
│   │   └── concreteproduct/      → SpainAddress, SpainPhone, USAAddress, USAPhone
│   └── strategypattern/
│       ├── strategy/             → ReportStrategy + 7 implementations
│       └── service/              → ReportService
└── test/java/
├── singletonpattern/         → UndoTest (4 tests)
├── abstractfactorypattern/   → ContactTest (2 tests)
└── strategypattern/          → ReportServiceTest (7 tests)
```
---

## 🛠️ Technologies
| Tool | Version |
|------|---------|
| Java | 21 (Temurin) |
| Maven | 3.x |
| JUnit | 5.10.0 |
| IntelliJ IDEA | 2025.x |

---

## ▶️ How to run

### Prerequisites
- Java 21+
- Maven 3.x
- IntelliJ IDEA (recommended)

### Installation
```bash
git clone https://github.com/Borgesjesk/S3.02-Patterns.git
cd S3.02-Patterns
```

Open in IntelliJ IDEA → it will automatically detect the Maven project and download dependencies.

---

## 🧪 How to test
Right click on `src/test/java` → **Run All Tests**

Or via terminal:
```bash
mvn test
```

**Results: 13 tests — all green ✅**

| Test Class | Tests | Status |
|---|---|---|
| UndoTest | 4 | ✅ |
| ContactTest | 2 | ✅ |
| ReportServiceTest | 7 | ✅ |

---

## 📚 What I learned
Before this sprint, patterns felt like abstract theory. After implementing them, I
can see exactly when and why to use each one:

- **Singleton** → when you need one shared resource (config, logger, connection pool)
- **Abstract Factory** → when your app needs to support multiple "families" of behavior
- **Strategy** → when you have multiple ways to do the same thing and want to swap them cleanly

The biggest lightbulb moment was realizing these patterns are just SOLID principles
applied in a structured, reusable way. 💡