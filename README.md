
---

#  GB Bank - Banking System in Java

##  About the Project

**GB Bank** is a simple banking system developed in **Java**, focused on practicing **Object-Oriented Programming (OOP)**, data handling, and console interaction.

The system allows users to:

* Create accounts (personal or business)
* Log in
* Check balance
* Deposit money
* Withdraw money
* View account data

---

##  Features

###  User Account

* Registration with:

    * Name
    * CPF (Brazilian ID)
    * Birth date
    * Age
    * Password (6 digits)
* Operations:

    * Deposit
    * Withdraw
    * Balance inquiry
    * View account data

###  Business Account

* Registration with:

    * Company name
    * CNPJ (Business ID)
    * Foundation date
    * Annual revenue
    * Password (6 digits)
* Business rule:

    * Can only be created if revenue ≥ **50,000**
* Operations:

    * Deposit
    * Withdraw
    * Balance inquiry
    * View account data

---

##  Project Structure

```
application/
 └── Program.java

entities/
 ├── Account.java (abstract class)
 ├── UserAccount.java
 └── BusinessAccount.java

menu/
 ├── LoginMenu.java
 └── BankMenu.java

services/
 ├── AccountService.java
 ├── UserAccountService.java
 ├── BusinessAccountService.java
 └── TransactionService.java
```

---

## 🏗 Architecture

The project follows a clear separation of responsibilities:

* **entities** → System data models
* **services** → Business logic
* **menu** → User interaction (console)
* **application** → Main execution class

---

##  Concepts Used

* Object-Oriented Programming (OOP)
* Inheritance (`Account` → `UserAccount` / `BusinessAccount`)
* Polymorphism
* Encapsulation
* Abstract classes
* Data validation
* Exception handling (`try/catch`)
* Date handling (`LocalDate`)
* Regex (password validation)

---

##  System Rules

* Password must contain **exactly 6 digits**
* Business account requires:

    * Minimum revenue of **50,000**
* Login requires:

    * Valid CPF/CNPJ and password

---

## ▶ How to Run

### 1. Requirements

* Java JDK 8 or higher

### 2. Compile

```bash
javac application/Program.java
```

### 3. Run

```bash
java application.Program
```

---

##  Example Usage

```
==== GB BANK ====
1- Create account
2- Login
0- Exit
```

After login:

```
=== BANK SERVICES ===
1- Balance
2- Deposit
3- Withdraw
4- Account data
0- Exit
```

---

##  Notes

* Data is stored in memory (ArrayList), meaning:

    * All data is lost when the program stops
* No database integration yet

---

##  Future Improvements

*  Database integration (MySQL / PostgreSQL)
*  Password encryption
*  Transaction history
*  Transfers between accounts
*  Graphical interface (JavaFX or Swing)
*  REST API with Spring Boot

---

##  Author

Gabriel de Sousa Ferreira.

---
