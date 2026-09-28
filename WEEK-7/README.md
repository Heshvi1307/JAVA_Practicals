# Java Annotations and Reflection Practicals

This repository contains three Java practicals based on custom annotations and Java Reflection.

## Practicals

### 1. Form Validator

In this practical, custom annotations `@NotBlank` and `@MaxLength(int)` are created and applied to fields of a `SignupForm`.

Reflection is used to read the annotations and validate the entered values...

The program checks:

* Whether a field is blank.
* Whether a field exceeds the maximum allowed length.
* Displays all validation errors....

Example:

```text
Enter name:
Enter username: verylongusername
Enter email: test@gmail.com

Validation Errors:
name cannot be blank
username cannot be more than 10 characters
```

Concepts used:

* Custom annotations
* Reflection
* Field validation
* Scanner
* ArrayList

---

### 2. Mini Test Runner

In this practical, a custom `@Run` annotation is created and applied to selected methods.

Reflection is used to find methods marked with `@Run` and execute only those methods.

The program also counts and displays the number of methods that were executed.

Example:

```text
Test 1 is running
Test 3 is running
Total tests ran: 2
```

Methods without `@Run` are not executed.

Concepts used:

* Custom method annotation
* Reflection
* Method
* `invoke()`
* Runtime annotations

This demonstrates the basic idea behind how testing frameworks such as JUnit identify test methods using annotations.

---

### 3. Column Mapping Using Reflection

In this practical, a custom `@Column(name)` annotation is created.

The user enters a header row and a data row. Reflection is then used to match the column names with the fields of the `Student` class.

The matching data is automatically assigned to the corresponding fields.

Example:

```text
Enter number of columns: 3

Enter column names:
Name
Age
Email

Enter data:
Flora
19
flora@gmail.com

Student Details:
Name: Flora
Age: 19
Email: flora@gmail.com
```

If a required column is missing, the program displays a warning.

Example:

```text
Column missing: Email
```

Concepts used:

* Custom annotations
* Reflection
* Field mapping
* User input
* Handling missing columns

---

## Technologies Used

* Java
* Java Annotations
* Java Reflection
* Scanner
* ArrayList

## Overall Working

```text
Custom Annotation
       ↓
Apply annotation to class fields/methods
       ↓
Reflection reads the annotation
       ↓
Program performs the required action
       ↓
Output is displayed
```

## Learning Outcomes

* Learned how to create and use custom annotations in Java.
* Learned how to use Reflection to access fields and methods at runtime.
* Learned how to validate data using annotations.
* Learned how to find and invoke methods dynamically.
* Learned how to map input data to object fields using annotations.

## Conclusion

These practicals demonstrate the basic use of custom annotations and Java Reflection. They show how annotations can provide information about fields or methods and how Reflection can be used to read that information and perform actions dynamically.
