# MiniBank Practice

A small layered Java app with a menu, file storage and JUnit tests. Built with Maven and packaged as a runnable JAR.

## Features

- Add an account with an opening balance
- Deposit money into an account
- List all accounts
- Save accounts to `accounts.txt` on exit and load them on start
- Invalid actions (empty name, negative amount, unknown account) show an error instead of crashing

## Folder Structure

```
minibank/
├── pom.xml
└── src/
    ├── main/java/minibank/
    │   ├── Main.java
    │   ├── model/Account.java
    │   ├── service/BankService.java
    │   └── storage/AccountStorage.java
    └── test/java/minibank/
        ├── BankServiceTest.java
        └── storage/AccountStorageTest.java
```

| File | Purpose |
|------|---------|
| `Account.java` | Model: holds a name and a balance |
| `BankService.java` | Service: business rules, keeps accounts in an `ArrayList` |
| `AccountStorage.java` | Storage: saves and loads accounts from a text file |
| `Main.java` | Menu-driven console program |
| `BankServiceTest.java` | Tests for adding, depositing and invalid actions |
| `AccountStorageTest.java` | Test that saved data reloads unchanged |

## Requirements

- JDK 17 or newer
- Apache Maven

## How to Run

Open a terminal in the folder that contains `pom.xml`:

```
mvn test
mvn package
java -jar target/minibank-1.0.jar
```

On Windows, use `target\minibank-1.0.jar`.

A successful test run ends with `Tests run: 5, Failures: 0` and `BUILD SUCCESS`.

## Menu

```
1. Add account
2. Deposit
3. List accounts
0. Save and exit
```

Choose `0` to save. The data is written to `accounts.txt` in the folder where you started the app.

## Tests

- Adding an account increases the count
- A deposit increases the balance
- A negative deposit throws an exception
- A deposit to an unknown account throws an exception
- Saving and then loading gives the same data

## What You Learn

- Layered design (model, service, storage, main)
- `ArrayList` and exceptions
- Packages
- File reading and writing with `java.nio.file`
- JUnit 5: `@Test`, `assertEquals`, `assertThrows`, `@TempDir`
- Maven and building a runnable JAR