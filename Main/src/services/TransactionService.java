package services;

import entities.Account;

public class TransactionService {

    private static final double MAX_DEPOSIT = 5000;
    private static final double MAX_WITHDRAW = 2000;

    public void showAccountBalance(Account account){
        System.out.printf("Balance: %.2f%n", account.getBalance());
    }

    public void accountDeposit(Account account, double value){
        if (value > MAX_DEPOSIT){
            IO.println("The maximum deposit allowed is R$5.000!");
            return;
        }

        account.deposit(value);

        IO.println("\nSuccessful deposit!");
        System.out.printf("New balance: %.2f%n", account.getBalance());
    }

    public void accountWithdraw(Account account, double value){
        if (value > MAX_WITHDRAW){
            IO.println("\nThe maximum withdraw allowed is R$2.000");
            return;
        }

        if (value > account.getBalance()){
            IO.println("Insufficient balance!");
            return;
        }

        account.withdraw(value);

        IO.println("Successful withdraw!");
        System.out.printf("New balance: %.2f%n", account.getBalance());
    }
}