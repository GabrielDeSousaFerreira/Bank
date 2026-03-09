# Bank User Registration System

A simple Java project that simulates a basic user registration system for a banking environment.

The program allows the user to enter personal data and store it in memory using an ArrayList.  
After the registration, the system can display the stored user information.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- Scanner (for input)

## Project Structure
src
│
├── entities
│ └── UserAccount.java
│
└── services
└── UserAccountService.java

### entities/UserAccount

This class represents a **bank user account**.  
It contains the user's personal data and the getters/setters.

Attributes:

- `name` – User's name
- `cpf` – Brazilian identification number
- `email` – User email
- `age` – User age

Example constructor:

```java
UserAccount user = new UserAccount(name, cpf, email, age);
services/UserAccountService

This class is responsible for:

collecting user data

creating the user object

storing the object in an ArrayList

displaying the stored users

Main methods:

createUser()

Reads user data from the keyboard and creates a new UserAccount.

displayUser()

Displays all registered users stored in the list.

How the Program Works

The program displays a welcome message.

The user enters personal information:

Name

CPF

Email

Age

The system creates a UserAccount object.

The object is stored in an ArrayList.

The user can choose to display the stored data.

=====================================
=== WELCOME TO CENTRAL BANK ===
=====================================

Type your personal data:

Name: Gabriel
CPF: 12345678900
E-mail: gabriel@email.com
Age: 25

New user added, welcome Gabriel

Do you want to see your entered data?
Concepts Practiced

Object-Oriented Programming

Class separation (Entities / Services)

Encapsulation

Lists with ArrayList

User input with Scanner

Author Gabriel de Sousa Ferreira
