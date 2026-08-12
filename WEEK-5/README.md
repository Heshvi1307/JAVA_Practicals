# 📚 WEEK-5 Practicals

## 1️⃣ Shape Areas

**File:** `ShapeAreas.java`

### Objective

Implement a shape area system using an abstract `Shape` class and different shape subclasses.

### Concepts Covered

- Abstract Classes
- Abstract Methods
- Inheritance
- Method Overriding
- Polymorphism
- Arrays of Objects
- User Input
- Loops

### Features

- Defines an abstract `Shape` class with an abstract `area()` method.
- Implements `Circle`, `Rectangle`, and `Triangle` subclasses.
- Takes shape details from the user.
- Stores different shapes in a `Shape[]` array.
- Uses polymorphism to calculate the area of each shape.
- Prints the area of every shape.
- Maintains a running total of all areas.
- Tracks and displays the shape with the largest area.

---

## 2️⃣ Payroll

**File:** `Payroll.java`

### Objective

Implement a payroll system using an abstract `Employee` class with different types of employees having different salary calculations.

### Concepts Covered

- Abstract Classes
- Abstract Methods
- Inheritance
- Method Overriding
- Runtime Polymorphism
- Constructor Chaining
- `super()`
- `instanceof`
- Arrays of Objects
- User Input
- Loops

### Features

- Defines an abstract `Employee` class with an abstract `monthlySalary()` method.
- Implements `FullTime`, `PartTime`, and `Intern` subclasses.
- Calculates FullTime salary using a fixed monthly salary.
- Calculates PartTime salary using **hours × hourly rate**.
- Calculates Intern salary using a fixed stipend.
- Uses `super()` to initialize the shared employee name and ID.
- Stores different employee types in an `Employee[]` array.
- Uses polymorphism to calculate each employee's salary.
- Uses `instanceof` to identify the type of employee.
- Displays an additional note for interns.
- Calculates and displays the total payroll.

---

## 3️⃣ Media Late Fee

**File:** `MediaFee.java`

### Objective

Model different types of media that calculate late fees differently and calculate the total fee for a returned batch.

### Concepts Covered

- Abstract Classes
- Abstract Methods
- Inheritance
- Method Overriding
- Runtime Polymorphism
- Constructor Chaining
- `super()`
- `instanceof`
- Arrays of Objects
- User Input
- Loops

### Features

- Defines an abstract `Media` class with an abstract `lateFee()` method.
- Implements different media types such as `Book`, `DVD`, and `Magazine`.
- Applies different late-fee rules for each media type.
- Takes media details and late days from the user.
- Stores different media types in a `Media[]` array.
- Uses polymorphism to calculate the late fee for each media item.
- Uses `instanceof` to identify the media type.
- Displays the late fee for each returned item.
- Calculates and displays the total late fee.

> **Note:** This practical is designed as an **Advanced Learners – Home Practice** problem.

---

# 🛠 Technologies Used

- Java
- VS Code
- Git
- GitHub

---

# 🎯 Learning Outcomes

Through these practicals, I learned:

- Abstract Classes and Abstract Methods
- Inheritance
- Method Overriding
- Runtime Polymorphism
- Constructor Chaining using `super()`
- `instanceof` Operator
- Arrays of Objects
- User Input using `Scanner`
- Designing Class Hierarchies
- Applying OOP concepts to real-world problems
- Processing multiple objects using loops

---

# 🚀 How to Run

Navigate to the Week-5 folder:

```bash
cd WEEK-5