# Finance Manager Java

Terminal application built in Java to practice the foundations required before Spring Boot.

## Version 1

The first version keeps data in memory and focuses on a small but functional financial flow.

## Current features

- Register income and expenses
- List registered transactions
- Calculate the current balance
- Calculate totals by transaction type
- Find a transaction by its description

## Project structure

```text
src/main/java/br/com/nicolas/financemanager/
├── Main.java
├── model/
│   ├── Transaction.java
│   └── TransactionType.java
└── service/
    └── FinanceManager.java
```

- `Transaction` represents an income or expense.
- `TransactionType` defines the available transaction types.
- `FinanceManager` stores and manages transactions in memory.
- `Main` starts the application and demonstrates the current flow.

## Running the project

1. Open the repository in VS Code with the Java extension installed.
2. Open `Main.java`.
3. Run the `main` method.

The application prints the transactions, balance, income total and expense total in the terminal.

## Learning progress

Completed in this version:

- Classes, objects, constructors and encapsulation
- Enums
- Methods and return values
- Association between `FinanceManager` and `Transaction`
- `List`, `ArrayList` and `for-each`
- `BigDecimal` for financial calculations

Next steps:

- Continue collection operations and validations
- Handle errors and invalid operations with exceptions
- Add persistence with SQL and JDBC
- Create tests and later evolve the project into a Spring Boot API

## Technologies

- Java
- Java Collections with `List` and `ArrayList`
- `BigDecimal` for financial values
- Terminal application
