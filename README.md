# ⚡️ PulseGrid System

A Java-based Object-Oriented Programming (OOP) project built to demonstrate inheritance and related concepts through a structured role-based system.

---

## 📌 Overview

PulseGrid models a system where different entities — User, ActiveUser, and Admin — interact within a clear inheritance hierarchy.

The focus is on behavior, relationships, and code structure, making core OOP concepts easy to understand through execution.

---

## 🧠 Concepts Demonstrated

- Class Inheritance (extends)
- Superclass vs Subclass
- Single, Multilevel & Hierarchical Inheritance
- Method Overriding
- this and super keywords
- Constructor chaining (super())
- Protected Access Modifier
- Method Hiding (static methods)
- final class and methods
- Package structure & visibility
- Java Multiple Inheritance restriction

---

## 🏗 Project Structure


src/
└── pulsegrid/
├── core/
│ ├── Entity.java
│ ├── User.java
│ ├── ActiveUser.java
│ ├── Admin.java
│ └── SystemLock.java
└── app/
└── MainApp.java


---

## ▶️ How to Run

### 1. Clone the repository
```bash
git clone https://github.com/your-username/pulse.git
cd pulse/src
2. Compile the project
javac pulsegrid/core/*.java pulsegrid/app/MainApp.java
3. Run the program
java pulsegrid.app.MainApp
⚙️ Key Features
Clear inheritance hierarchy with real execution flow
Demonstrates method overriding and method hiding
Proper use of super and this
Includes final class and method restrictions
Organized using Java packages
🎯 Purpose

This project was created as part of an OOP assignment to demonstrate a solid understanding of Java inheritance and class relationships in a practical way.

🚀 Future Improvements
Add user input (Scanner)
Add GUI (JavaFX or Swing)
Expand role permissions system

👤 Author
Betselot zeleke

