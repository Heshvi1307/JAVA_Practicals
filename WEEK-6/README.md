# Week 6 – Functional Interfaces and Lambda Expressions

## Overview

This practical covers functional programming architectures in Java, including the design of custom functional interfaces, anonymous inner classes, dynamic behavior mapping using lambda expressions, runtime structural filtering with marker interfaces, and package-isolated dynamic calculation systems.

## Practicals Covered

### 1. Guarded Remote Control

* Created a smart hardware matrix simulation incorporating `Fan` and `Light` device profiles.
* Implemented a `Switchable` interface providing standard operational signatures and a fallback `default` toggle routine.
* Designed an automated verification framework utilizing a custom `@FunctionalInterface` to evaluate time-based activation rules.
* Provided alternative condition verification implementations using both an inline anonymous class block and a streamlined lambda expression.
* Processed hardware arrays polymorphically using loop structures to toggle states across distinct component objects.

### 2. Decoupled Broadcast Network

* Created a multi-channel message dispatcher utility handling `Email` and `SMS` pipelines.
* Implemented a core functional interface contract using the `@FunctionalInterface` compiler safeguard.
* Created a custom marker interface:
  * `Urgent`
* Organized discrete communication channels using functional references stored within unified interface arrays.
* Checked metadata markers at runtime using the `instanceof` conditional type operator.
* Processed urgent channels with a targeted dual-transmission mechanism without altering global pipeline routines...

### 3. Dynamic Package-Isolated Discount Engine

* Created a console-driven calculation engine to apply variable commercial deductions to transaction lists.
* Encapsulated domain components into localized packages using explicit namespace declarations.
* Created specialized rules as standalone functional objects:
  * `DiscountRule`
* Stored array data sets safely while routing arithmetic functions through runtime switch statements.
* Evaluated conditional bounds inside closures to ensure final numbers never fall below zero-dollar thresholds.
* Allowed users to input numbers dynamically, run variable calculation passes, and loop the engine menu until explicit exit signals are received.

## Learning Outcomes

* Understand and design structural functional interfaces using the `@FunctionalInterface` annotation.
* Streamline boilerplate code using single-line lambda closures to inject behavior dynamically.
* Leverage polymorphic interface arrays to manage and orchestrate distinct concrete implementations.
* Apply marker interface patterns to dynamically evaluate object states at runtime using `instanceof`.
* Organize modular enterprise applications inside dedicated packages and manage user input matrices safely.

## Technologies Used

* Java
* `Scanner`
* `ArrayList` / `List`
* Functional Interfaces
* Lambda Expressions
* Anonymous Inner Classes
* Marker Interfaces
* Interface Default Methods
* Java Packages
* User-defined Methods

## How to Run

Compile the required Java file:

```bash
javac FileName.java
```

Run the program:

```bash
java ClassName
```

For example:

```bash
# To run Problem 1
javac RemoteControl.java
java RemoteControl

# To run Problem 3 (Navigate to source root first)
cd DiscountEngine/src
javac Discount/*.java
java Discount.DiscountEngine

