# Java Generics Practicals

This repository contains three Java practicals based on Generics, bounded type parameters, and generic data structures.

## Practicals

### 1. Generic Containers Using Box, Pair and a Generic Method

In this practical, a generic `Box<T>` class is created to store and retrieve values of different types. A generic `Pair<A, B>` class is also implemented to store two values of different types.

A generic method `firstElement()` returns the first element of an array without requiring explicit type casting.

The program demonstrates:

* Creating generic classes.
* Storing and retrieving values using `Box<T>`.
* Storing two different types using `Pair<A, B>`.
* Writing a generic method for arrays.
* Using generics to achieve type safety.

Example:

```text
Enter a name for the box: Riya
Enter a number for the box: 25

Enter your age: 19
Enter your city: Vadodara

Pair details:
First value: 19
Second value: Vadodara

Enter number of fruits: 3
Enter fruit 1: Mango
Enter fruit 2: Apple
Enter fruit 3: Orange

First fruit: Mango
```

Concepts used:

* Generics
* `Box<T>`
* `Pair<A, B>`
* Generic methods
* Arrays
* `Scanner`
* Type safety

---

### 2. Bounded Statistics Using Number

In this practical, a generic method `average()` calculates the average of numeric arrays using the bounded type parameter `<N extends Number>`.

The program accepts integer, decimal, and long values from the user and calculates their averages using the same method.

The program demonstrates:

* Using bounded type parameters.
* Calculating averages of different numeric types.
* Converting numeric values using `doubleValue()`.
* Reusing one generic method for multiple data types.
* Handling empty arrays without division by zero.

Example:

```text
Enter number of integer values: 3
Enter integer 1: 10
Enter integer 2: 20
Enter integer 3: 30

Enter number of decimal values: 2
Enter decimal value 1: 2.5
Enter decimal value 2: 3.5

Enter number of long values: 2
Enter long value 1: 1000
Enter long value 2: 2000

Averages:
Integer average: 20.0
Double average: 3.0
Long average: 1500.0
```

Concepts used:

* Bounded generics
* `Number` class
* Generic methods
* `Integer`, `Double`, and `Long`
* `doubleValue()`
* Average calculation

The bound `N extends Number` prevents the method from accepting non-numeric types such as `String`.

---

### 3. Generic Stack Using an Array

In this practical, a generic stack class `MyStack<T>` is implemented using an array.

The stack supports adding and removing elements while following the Last In, First Out (LIFO) principle. The same generic stack implementation is reused for strings and integers.

The program demonstrates:

* Implementing a generic container.
* Storing elements in an array.
* Adding elements using `push()`.
* Removing elements using `pop()`.
* Displaying stack contents.
* Handling full and empty stack conditions.
* Reusing the stack with different data types.

Example:

```text
How many names do you want to push (0-5)? 3
Enter name: Riya
Enter name: Aman
Enter name: Meera
Remove one name? (yes/no): yes

Stack contents:
Meera
Aman
Riya

Removed name: Meera

Testing stack with integers:
Enter an integer to push: 25
Added: 25
Popped number: 25

Trying to pop again:
Stack is empty!
```

Concepts used:

* Generic classes
* Type parameters
* Arrays
* Stack operations
* LIFO principle
* Type safety
* Empty and full condition handling

---

## Technologies Used

* Java
* Generics
* Generic classes and methods
* Bounded type parameters
* Arrays
* `Number`
* `Scanner`
* Exception and boundary handling

## Overall Working

```text
Define Generic Class or Method
          ↓
Specify the Required Data Type
          ↓
Accept and Store User Input
          ↓
Perform Generic Operations
          ↓
Display the Result
```

## Learning Outcomes

* Learned how to create reusable generic classes and methods.
* Understood how generics improve compile-time type safety.
* Learned how to use bounded type parameters with `Number`.
* Practiced calculating averages for different numeric types.
* Learned how to implement a generic stack using an array.
* Understood LIFO operations and empty or full stack conditions.
* Learned how to reuse the same generic implementation with different data types.

## Conclusion

These practicals demonstrate the use of Java Generics to create reusable, type-safe classes and methods. They cover generic containers, bounded numeric operations, and an array-based generic stack, providing practical experience in writing flexible Java programs.
