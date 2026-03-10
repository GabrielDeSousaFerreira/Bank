package services;

import entities.UserAccount;

import java.util.*;

public class UserAccountService {

    //UserAccount user = new UserAccount(name, cpf, email, age, password, balance);

    private static final String HEADER =
            "==========================\n" +
            "===    ACCOUNT MENU    ===\n" +
            "===========================";

    private ArrayList<UserAccount> users = new ArrayList<>();

    public void createUser(Scanner sc){

        IO.println(HEADER);

        IO.print("Name: ");
        String name = sc.nextLine();

        IO.print("CPF: ");
        String cpf = sc.nextLine();

        IO.print("Email: ");
        String email = sc.nextLine();

        IO.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        String password = readPassword(sc);

        UserAccount user = new UserAccount(name, cpf, email, age, password);

        users.add(user);

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

    public UserAccount login(String cpf, String password){
        for (UserAccount user : users){
            if (user.getCpf().equals(cpf) && user.getPassword().equals(password)){
                IO.println("Login succesed! Welcome " + user.getName());
                return user;
            }
        }
        return null;
    }
}
