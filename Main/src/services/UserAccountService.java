package services;

import entities.Account;
import entities.UserAccount;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class UserAccountService {

    private static final String HEADER =
            "==========================\n" +
            "===    ACCOUNT MENU    ===\n" +
            "===========================";

    private ArrayList<Account> accounts = new ArrayList<>();

    public void createUser(Scanner sc){

        IO.println(HEADER);

        IO.print("Name: ");
        String name = sc.nextLine();

        IO.print("CPF: ");
        String cpf = sc.nextLine();

        IO.print("Birth date (dd/MM/yyyy): ");

        LocalDate birthDate = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (birthDate == null) {
            try {
                String input = sc.nextLine();
                birthDate = LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                IO.println("Invalid date! Please use format yyyy/MM/dd");
                IO.print("Try again: ");
            }
        }

        IO.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        IO.print("Password: ");
        String password = readPassword(sc);

        UserAccount user = new UserAccount(password, name, cpf, birthDate, age);

        IO.println(user);

        accounts.add(user);

        IO.println("User created successfully!");
    }

    private String readPassword(Scanner sc){

        String password;

        do {

            IO.print("Create a 6 digit password: ");
            password = sc.nextLine();

            if (!password.matches("\\d{6}")){
                IO.println("Password must contain exactly 6 numbers!");
            }

        } while (!password.matches("\\d{6}"));

        return password;
    }

    public Account login(String document, String password){
        for (Account acc : accounts){
            if (acc.getDocument().equals(document) &&
                    acc.getPassword().equals(password)) {

                IO.println("Login successful! Welcome " + acc.getDisplayName());
                return acc;
            }
        }

        IO.println("Invalid credentials!");
        return null;
    }
}
