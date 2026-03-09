package services;

import entities.UserAccount;

import java.util.*;

public class UserAccountService {

    private static final String HEADER =
            "=====================================\n" +
            "===    WELCOME TO CENTRAL BANK    ===\n" +
            "=====================================";

    private static final ArrayList<UserAccount> userAccountList = new ArrayList<>();

    public static void createUser(){
        Scanner sc = new Scanner(System.in);

        IO.println(HEADER);
        IO.println("\nType your personal data:");
        IO.print("\nName: ");
        String name = sc.nextLine();
        IO.print("\nCPF: ");
        String cpf = sc.nextLine();
        IO.print("\nE-mail: ");
        String email = sc.nextLine();
        IO.print("\nAge: ");
        int age = sc.nextInt();
        sc.nextLine();

        UserAccount user = new UserAccount(name, cpf, email, age);

        userAccountList.add(user);

        IO.println("\nNew user added, welcome " + name);

        IO.println("\nDo you want to see your entered data?");
        char letter = sc.nextLine().toUpperCase().charAt(0);

        if (letter == 'S'){
            displayUser();
        }
    }

    public static void displayUser(){
        for (UserAccount user : userAccountList) {
            IO.println("\n==============================");
            IO.println("Name: " + user.getName());
            IO.println("CPF: " + user.getCpf());
            IO.println("Email: " + user.getEmail());
            IO.println("Age: " + user.getAge());
        }
    }
}
