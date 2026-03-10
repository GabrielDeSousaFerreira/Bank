package application;

import services.UserAccountService;
import menu.LoginMenu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserAccountService userAccountService = new UserAccountService();
        LoginMenu loginMenu =  new LoginMenu();

        int option;

        do {
            IO.println("\n==== GB BANK ====");
            IO.println("1- Create account");
            IO.println("2- Login");
            IO.println("0- Exit");
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    userAccountService.createUser(sc);
                    break;
                case 2:
                    loginMenu.loginScreen(userAccountService, sc);
                    break;
                case 0:
                    IO.println("Closing system...");
                    break;
                default:
                    IO.println("Invalid operation!");
            }
        } while (option != 0);
    }
}
