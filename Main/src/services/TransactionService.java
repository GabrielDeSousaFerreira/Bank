package services;

import entities.UserAccount;

public class TransactionService {
    private static final double MAX_DEPOSIT = 5000;
    private static final double MAX_WITHDRAW = 1000;

    public void showAccountBalance(UserAccount user){
        System.out.printf("Balance: %.2f%n", user.getBalance());
    }

    public void accountDeposit(UserAccount user, double value){
        if (value > MAX_DEPOSIT){
            IO.println("The maximum deposit allowed is R$5.000!");
            return;
        }

        user.deposit(value);

        IO.println("\nSuccessful deposit!");
        System.out.printf("New balance: %.2f%n", user.getBalance());
    }

    public void accountWithdraw(UserAccount user, double value){
        if (value > MAX_WITHDRAW){
            IO.println("\nThe maximum withdraw allowed is R$1.000");
            return;
        }

        if (value > user.getBalance()){
            IO.println("Insufficient balance!");
            return;
        }

        user.withdraw(value);

        IO.println("Successful withdraw!");
        System.out.printf("New balance: %.2f%n", user.getBalance());
    }
}
