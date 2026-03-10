# Bank User Registration System

A simple banking system developed in Java focused on Object-Oriented Programming (OOP) and clean project structure using packages.

This project simulates a basic banking environment where users can:
- Create an account
- Log into the system
- Perform banking operations
- View account information

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- ArrayList
- Scanner
- Layered architecture (packages)

## Project Structure
src
│
├── application
│   └── Main.java
│
├── entities
│   └── UserAccount.java
│
├── menu
│   ├── LoginMenu.java
│   └── BankMenu.java
│
└── services
├── UserAccountService.java
└── TransactionService.java

# entities

## UserAccount

Contains the system model classes.

Represents a bank user account.

Attributes:
- `name` – User's name
- `cpf` – Brazilian identification number
- `email` – User email
- `age` – User age
- `password` - Account password
- `balance` - Account balance

This class also includes:
- Constructors
- Getters and Setters

# services

Responsible for the system business logic.

## UserAccountService.java

Responsible for:
- Creating accounts
- Storing accounts in memory
- Searching users
- Validating login

Uses:
`ArrayList<UserAccount>` to store created accounts.

## TransactionService.java

Responsible for bank transactions, such as:
- Deposit
- Withdrawal
- Transfer
- Bill payment

# menu

Contains the classes responsible for the console interaction with the user.

## LoginMenu.java

Responsible for:
- Creating accounts
- Creating a password
- User login
- Redirecting the user to the bank menu

## BankMenu.java

Menu displayed after the user logs in.
- Allows the user to:
- Deposit money
- Withdraw money
- Transfer money
- Check account balance
- Exit the account

# Concepts Applied

- This project applies several important programming concepts:
- Object-Oriented Programming
- Separation of responsibilities
- Encapsulation
- Layered architecture
- List manipulation (ArrayList)
- User input with Scanner
- Console menu structures

# How to run project

## Clone the repository
`git clone https://github.com/your-username/bank-system.git`

## Open the project in an IDE such as:
- IntelliJ
- Eclipse
- VS Code

## Run the file

`Main.java`

# Exemple Execution

```java
==== GB BANK ===

1 - Create account
2 - Login
0 - Exit

//AFTER CREATE ACCOUNT

Enter your name:
Enter your CPF:
Enter your email:
Enter your age:
Create a 6-digit password:

//AFTER LOGIN

==== BANK MENU ====

1 - Deposit
2 - Withdraw
3 - Transfer
4 - Check balance
0 - Exit

@Author Gabriel Sousa Ferreira

Project developed for studying:
- Java
- Object-Oriented Programming
- System architecture and organization
