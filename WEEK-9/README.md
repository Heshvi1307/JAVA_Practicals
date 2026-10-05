# Week 9 – Multithreading, Race Conditions and Synchronization

## Overview

This practical focuses on multithreading in Java and demonstrates how multiple threads can access shared data at the same time.

The practicals demonstrate:

* Creating and using multiple threads
* Shared resources
* Race conditions
* Thread synchronization
* The `synchronized` keyword
* Thread-safe operations
* Parallel processing
* Execution time measurement
* Comparing different approaches to solving concurrency problems

---

# Practicals Covered

## 1. Counter Race

### Description

A shared counter is accessed by multiple threads.

Each thread increments the counter a fixed number of times. The program is first executed without synchronization to demonstrate a race condition.

The same program is then executed using the `synchronized` keyword to obtain the correct result.

### Concepts Used

* Java Threads
* Shared variables
* Race conditions
* `synchronized`
* `start()`
* `join()`
* Shared resource management

### Working

Suppose there are 4 threads and each thread increments the counter 10,000 times.

The expected result is:

```text
4 × 10,000 = 40,000
```

Without synchronization, multiple threads may access the counter simultaneously, causing some updates to be lost.

With synchronization, only one thread can update the counter at a time, so the final value is exactly correct.

### Main Concept

Without synchronization:

```text
Thread 1 ──┐
Thread 2 ──┤
Thread 3 ──┼──> Shared Counter
Thread 4 ──┘
```

This can cause a race condition.

With synchronization:

```text
Thread 1 → Counter
             ↓
Thread 2 → Counter
             ↓
Thread 3 → Counter
             ↓
Thread 4 → Counter
```

Only one thread accesses the synchronized section at a time.

---

# 2. Seat Booking Race

### Description

A simple seat booking system is created with a limited number of seats.

For example, the system may have 5 available seats while 10 users simultaneously try to book a seat.

Each user is represented by a separate thread.

The program is first executed without synchronization to demonstrate how multiple users can book the same remaining seat, resulting in overselling.

The booking operation is then synchronized to prevent this problem.

### Concepts Used

* Threads
* Shared resources
* Race conditions
* `synchronized`
* Thread safety
* Real-world concurrency
* Seat availability management

### Working

Suppose:

```text
Total Seats = 5
Total Users = 10
```

Only 5 users should successfully book seats.

Without synchronization, two or more threads may check the available seats at the same time.

For example:

```text
Seats Left = 1

User 1 → Checks → Seat available
User 2 → Checks → Seat available

User 1 → Books
User 2 → Books
```

This can result in more bookings than the number of available seats.

This problem is called **overselling**.

### Synchronized Solution

The booking method is synchronized:

```java
synchronized void synchronizedBook(String userName)
```

This ensures that only one thread can perform the booking operation at a time.

Therefore:

```text
5 Seats
   ↓
Maximum 5 Successful Bookings
   ↓
Remaining Users → Booking Failed
```

---

# 3. Parallel Array Sum

### Description

A large array of numbers is divided into multiple parts.

Each part is processed by a separate thread, and the threads calculate the total sum.

The program demonstrates the wrong result that can occur when multiple threads update one shared total without synchronization.

The problem is then solved using synchronization and by using local totals for each thread.

The execution time of different approaches is also measured and compared.

### Concepts Used

* Arrays
* Multiple threads
* Parallel processing
* Shared variables
* Race conditions
* Synchronization
* Local thread variables
* `System.nanoTime()`
* Performance comparison

### Working

Suppose an array contains a large number of elements.

Instead of one thread processing the complete array:

```text
Complete Array
      ↓
   One Thread
```

The array is divided between multiple threads:

```text
             Large Array
                 |
       ┌─────────┼─────────┐
       ↓         ↓         ↓
   Thread 1   Thread 2   Thread 3
       ↓         ↓         ↓
    Part 1      Part 2    Part 3
```

Each thread processes its assigned portion.

---

## Problem Without Synchronization

If all threads update the same total:

```java
total += value;
```

multiple threads may read and modify the value simultaneously.

This can cause some additions to be lost.

Therefore:

```text
Expected Total ≠ Actual Total
```

This is another example of a race condition.

---

# Solutions Used

## Method 1 – Synchronized Shared Total

The shared addition operation is synchronized:

```java
synchronized void synchronizedAdd(long value) {
    total += value;
}
```

Only one thread can modify the shared total at a time.

This produces the correct result.

However, threads may have to wait for each other when accessing the shared total.

---

## Method 2 – Local Total

Instead of updating one shared variable continuously, each thread calculates its own local total.

For example:

```text
Thread 1 → Local Total 1
Thread 2 → Local Total 2
Thread 3 → Local Total 3
Thread 4 → Local Total 4
```

After all threads finish, the main thread combines the local totals:

```text
Final Total =
Local Total 1
+ Local Total 2
+ Local Total 3
+ Local Total 4
```

This reduces the need for synchronization and can provide better performance.

---

# Performance Comparison

The execution time is measured using:

```java
System.nanoTime();
```

The start time is recorded before the calculation:

```java
long startTime = System.nanoTime();
```

The end time is recorded after all threads complete:

```java
long endTime = System.nanoTime();
```

The execution time is calculated as:

```text
Execution Time = End Time - Start Time
```

For a fair comparison, each method should ideally be executed multiple times and the average execution time should be considered.

### Comparison

| Method                    | Correct Result | Race Condition | Synchronization | Performance               |
| ------------------------- | -------------- | -------------- | --------------- | ------------------------- |
| No Synchronization        | No             | Yes            | No              | Usually faster but unsafe |
| Synchronized Shared Total | Yes            | No             | Yes             | Can be slower             |
| Local Totals              | Yes            | No             | Minimal         | Usually more efficient    |

The actual execution time depends on the computer, array size, number of threads, and system load.

---

# Important Thread Methods

## start()

The `start()` method begins execution of a thread.

Example:

```java
thread.start();
```

---

## join()

The `join()` method makes the main program wait until the thread finishes.

Example:

```java
thread.join();
```

This is important when the final result depends on all threads completing their work.

---

## synchronized

The `synchronized` keyword allows only one thread at a time to execute a synchronized method or block for the same object.

Example:

```java
synchronized void increment() {
    count++;
}
```

It is used to protect shared data from race conditions.

# Technologies and Concepts Used

| Technology / Concept | Purpose                                      |
| -------------------- | -------------------------------------------- |
| Java                 | Programming language                         |
| Thread               | Performs concurrent tasks                    |
| `Thread` class       | Creating threads                             |
| `start()`            | Starts thread execution                      |
| `join()`             | Waits for thread completion                  |
| `synchronized`       | Provides thread-safe access                  |
| Race Condition       | Demonstrates concurrent data access problems |
| Shared Variables     | Data accessed by multiple threads            |
| Arrays               | Stores large amounts of data                 |
| Parallel Processing  | Divides work between threads                 |
| `System.nanoTime()`  | Measures execution time                      |

---

# How to Run

## Step 1: Open Terminal

Open Command Prompt or Terminal in the folder containing the Java file.

## Step 2: Compile the Program

Use:

```bash
javac FileName.java
```

## Step 3: Run the Program

Use:

```bash
java ClassName
```

For example:

```bash
javac CounterRace.java
java CounterRace
```

For the seat booking practical:

```bash
javac SeatBookingRace.java
java SeatBookingRace
```

For the parallel array sum practical:

```bash
javac ParallelArraySum.java
java ParallelArraySum
```

# Conclusion

These practicals demonstrate important concepts of multithreading and synchronization in Java.

The Counter Race practical shows how multiple threads accessing the same counter can produce an incorrect result and how synchronization fixes the problem.

The Seat Booking Race practical demonstrates a real-world race condition where multiple users can attempt to book limited seats simultaneously. Synchronization ensures that the number of successful bookings does not exceed the available seats.

The Parallel Array Sum practical demonstrates how a large data set can be divided among multiple threads. It also compares different approaches, including unsynchronized access, synchronized access, and local totals, while measuring their execution time.

Overall, these practicals provide a basic understanding of **race conditions, synchronization, thread safety, parallel processing, and performance comparison in Java**.
