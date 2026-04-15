package services;

import entities.Account;

import java.util.ArrayList;

public class AccountService {

    private ArrayList<Account> accounts;

    public AccountService(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account login(String document, String password) {
        for (Account acc : accounts) {
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