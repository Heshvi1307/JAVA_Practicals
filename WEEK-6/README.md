# Week 6 – Exception Handling and Resource Management

## Overview

This practical covers advanced exception handling concepts in Java, including custom checked exceptions, user input validation, multi-catch blocks, inventory management, and automatic resource management using try-with-resources.

## Practicals Covered

### 1. Guarded Calculator

* Created a user-input-based calculator for `+`, `-`, `*`, and `/`.
* Implemented custom exceptions for negative numbers, invalid operators, multiplication by zero, and division by zero.
* Handled invalid integer input using `NumberFormatException`.
* Used `try-catch-finally` for exception handling and attempt logging.
* Used modular methods to separate validation and calculation logic.
* Allowed the user to continue or exit the calculator.

### 2. Stock Issue Management

* Created a `Warehouse` system for electronic devices such as Mobile, Laptop, IdeaPad, and Tablet.
* Implemented `issue(item, qty)` to process stock requests.
* Created custom checked exceptions:

  * `OutOfStockException`
  * `InvalidQuantityException`
  * `ItemNotFoundException`
* Stored and updated inventory using arrays.
* Included the stock shortfall in `OutOfStockException`.
* Used multi-catch to handle different request failures.
* Processed each request independently without stopping the complete run.

### 3. AutoCloseable Resource

* Created a custom resource implementing the `AutoCloseable` interface.
* Used try-with-resources for automatic resource management.
* Demonstrated that the resource is closed even when an exception occurs.
* Demonstrated the difference between the original and suppressed exceptions.
* Used a custom resource to understand automatic cleanup without external files or libraries.

## Learning Outcomes

* Apply advanced exception handling techniques using custom checked exceptions.
* Design modular Java programs using classes and user-defined methods.
* Handle multiple independent operations without terminating the complete program.
* Understand automatic resource management using `AutoCloseable` and try-with-resources.
* Distinguish between primary and suppressed exceptions during resource cleanup.

## Technologies Used

* Java
* `Scanner`
* Custom Exceptions
* `try-catch-finally`
* Multi-catch
* `AutoCloseable`
* Try-with-resources
* Arrays
* User-defined methods

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
javac GaurdedCalc.java
java GaurdedCalc
```
