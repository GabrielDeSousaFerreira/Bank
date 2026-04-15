package application;

import entities.Account;
import services.AccountService;
import services.BusinessAccountService;
import services.UserAccountService;
import menu.LoginMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Account> accounts = new ArrayList<>();

        AccountService accountService = new AccountService(accounts);

        UserAccountService userAccountService = new UserAccountService(accountService);
        BusinessAccountService businessAccountService = new BusinessAccountService(accountService);

        LoginMenu loginMenu = new LoginMenu(accountService, userAccountService, businessAccountService);

        int option;

        do {
            IO.println("\n==== GB BANK ====");
            IO.println("1- Create account");
            IO.println("2- Login");
            IO.println("0- Exit");

            String input = sc.nextLine();

            try {
                option = Integer.parseInt(input);

                switch (option){
                    case 1:
                        IO.println("\n1- User account");
                        IO.println("2- Business account");
                        int opc = sc.nextInt();
                        sc.nextLine();

                        if (opc == 1) {
                            userAccountService.createUser(sc);
                        } else if (opc == 2) {
                            businessAccountService.createBusinessAccount(sc);
                        }
                        break;
                    case 2:
                        loginMenu.loginScreen(sc);
                        break;
                    case 0:
                        IO.println("Closing system...");
                        break;
                    default:
                        IO.println("Invalid operation!");
                }
            } catch (NumberFormatException e) {
                IO.println("Please enter a valid number!");
                option = -1;
            }
        } while (option != 0);
    }
}