# ⚡ Java Practicals — Week 6: Interfaces & Lambda Magic

![Java Version](https://shields.io)
![Topics Covered](https://shields.io)

Welcome to the **Week 6** practical directory! This module explores advanced Object-Oriented Programming (OOP) architectures in Java. It breaks away from rigid class hierarchies to implement flexible, decoupled code using **Functional Interfaces**, **Anonymous Class Blocks**, **Marker Tags**, and **Dynamic Lambda Closures**.

---

## 📂 Project Architecture

```text
WEEK-6/
├── 🎛️ RemoteControl.java       # System 1: Polymorphic device matrix with runtime locks
├── 📣 Notification.java        # System 2: Priority message dispatcher with marker tagging
└── 🛒 DiscountEngine/          # System 3: Package-isolated dynamic mathematical engine
    └── src/
        └── Discount/
            ├── DiscountRule.java
            ├── DiscountRules.java
            └── DiscountEngine.java
```

---

## 🛠️ Deep-Dive into the Systems

### 🎛️ 1. Intelligent Remote Control Matrix (`RemoteControl.java`)
A device control simulation handling polymorphic execution through abstract definitions. It features an automated authorization checkpoint system to restrict runtime operations based on chronological variables.

* **Polymorphic Arrays:** Stores distinct hardware behaviors (`Fan`, `Light`) inside a single `Switchable[]` interface array.
* **Fallback Defaults:** Leverages Java's `default` interface keyword to automate standard `toggle()` loops without breaking downstream implementations.
* **The Evolution of Style:** Side-by-side comparison handling the exact same verification algorithm—once via an inline **Anonymous Inner Class**, and once using a modern, lightweight **Lambda Expression**.

---

### 📣 2. Decoupled Broadcast Network (`Notification.java`)
A multi-layered communications utility engineered to dispatch system payloads across varying pipelines (`Email` and `SMS`) using ultra-clean, inline behavioral abstractions.

* **Functional Blueprints:** Enforces strict code structures using the `@FunctionalInterface` contract compiler safeguard.
* **Marker Interface Pattern:** Integrates an empty interface footprint (`Urgent`) to dynamically tag metadata states without altering structural properties.
* **Metadata Interrogation:** Evaluates component references at runtime using `instanceof` blocks, instantly triggering aggressive double-broadcast loops for time-sensitive emergency lines.

---

### 🛒 3. Dynamic Package-Isolated Discount Engine (`DiscountEngine/`)
An enterprise-style console tool built to evaluate raw financial arrays against user-selected algebraic calculation rules selected dynamically at execution time.

* **Domain Isolation:** Fully encapsulated under the `package Discount;` namespace to avoid structural pollution.
* **Behavioral Injection:** Instead of hardcoding math functions, mathematical rules are generated as functional objects (`DiscountRule`) and cleanly evaluated inside real-time calculations.
* **Data Sanitization:** Implements protective boundaries within closures to guarantee output data never dips below floor metrics (e.g., zero-dollar thresholds).

---

## 🎯 Mastered Capabilities

* **Functional Automation:** Stripping away bulky boilerplate code in favor of expressive, single-line **Lambda Expressions**.
* **Decoupled Architecture:** Using polymorphic interface references to call specialized class algorithms dynamically.
* **Metadata Tagging:** Applying **Marker Interfaces** to filter and alter execution routing at runtime.
* **Modular Codebases:** Bundling discrete application nodes inside explicitly declared **Java Packages** for distribution.

---

## 🚀 Execution Guide

Ensure the Java Development Kit (JDK 8+) is installed and globally mapped in your environment variables.

### 🟢 Running Standalone Applications (Problems 1 & 2)
Compile and launch the standalone modules directly from the parent workspace directory:
```bash
# System 1: Remote Control Matrix
javac RemoteControl.java
java RemoteControl

# System 2: Notification Network
javac Notification.java
java Notification
```

### 🔵 Running the Packaged Discount Engine (Problem 3)
Navigate into the root source tree folder and point the compiler directly to the encapsulated package structure:
```bash
# Shift into the source root
cd DiscountEngine/src

# Compile the package domain entirely
javac Discount/*.java

# Run using the fully-qualified package naming convention
java Discount.DiscountEngine
```
