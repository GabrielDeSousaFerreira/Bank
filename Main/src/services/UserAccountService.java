package services;

import entities.UserAccount;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class UserAccountService {
    private static final String HEADER =
            "=======================\n" +
            "===    USER MENU    ===\n" +
            "=======================";

    private AccountService accountService;

    public UserAccountService(AccountService accountService){
        this.accountService = accountService;
    }

    public void createUser(Scanner sc){
        IO.println(HEADER);

        sc.nextLine();
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

        IO.print("Create your password: ");
        String password = readPassword(sc);

        UserAccount user = new UserAccount(password, name, cpf, birthDate, age);

        IO.println(user);

        accountService.addAccount(user);

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
}
