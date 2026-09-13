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

## Technologies

- Java
- Java Collections with `List` and `ArrayList`
- `BigDecimal` for financial values
- Terminal application
