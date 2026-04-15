package services;

import entities.BusinessAccount;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class BusinessAccountService {
    private static final String HEADER =
            "==========================\n" +
            "===    COMPANY MENU    ===\n" +
            "==========================";

    private AccountService accountService;

    public BusinessAccountService(AccountService accountService){
        this.accountService = accountService;
    }

    public void createBusinessAccount (Scanner sc) {
        Locale.setDefault(Locale.US);
        IO.println(HEADER);

        IO.print("Company name: ");
        String companyName = sc.nextLine();

        IO.print("CNPJ: ");
        String cnpj = sc.nextLine();

        IO.print("Foundation date (dd/MM/yyyy): ");
        LocalDate foundationDate = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (foundationDate == null) {
            try {
                String input = sc.nextLine();
                foundationDate = LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                IO.println("Invalid date! Please use format dd/MM/yyyy");
                IO.print("Try again: ");
            }
        }

        IO.print("Type annual revenue: ");
        double annualRevenue = readDouble(sc);

        IO.println("Password:");
        String password = readPassword(sc);

        BusinessAccount bc = new BusinessAccount(cnpj, companyName, foundationDate, annualRevenue, password);

        if (!bc.isEligible()) {
            IO.println("\nYou are not approved to open a business account!");
            return;
        }

        IO.println(bc);

        accountService.addAccount(bc);

        IO.println("User created successfully!");
    }

    private double readDouble(Scanner sc) {
        while (true) {
            String input = sc.nextLine();

            try {
                input = input.replace(",", "."); // aceita vírgula e ponto
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                IO.println("Invalid value! Please enter a valid number:");
            }
        }
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
