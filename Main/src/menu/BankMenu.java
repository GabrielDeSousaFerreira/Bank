package menu;

import java.util.*;

import entities.Account;
import services.TransactionService;

public class BankMenu {

    TransactionService transactionService = new TransactionService();

    private static final String HEADER =
            "=====================================\n" +
            "===          BANK SERVICES        ===\n" +
            "=====================================";

    public void mainBank(Account account, Scanner sc){
        Locale.setDefault(Locale.US);

        int option;

        do {
            IO.println(HEADER);
            IO.println("\n1- Balance");
            IO.println("2- Deposit");
            IO.println("3- Withdraw");
            IO.println("4- Account data");
            IO.println("0- Exit");

            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    transactionService.showAccountBalance(account);
                    break;

                case 2:
                    IO.println("How much do you want to deposit?");
                    double depositValue = sc.nextDouble();
                    transactionService.accountDeposit(account, depositValue);
                    break;

                case 3:
                    IO.println("How much do you want to withdraw?");
                    double withdrawValue = sc.nextDouble();
                    transactionService.accountWithdraw(account, withdrawValue);
                    break;

                case 4:
                    IO.println(account);
                    break;

                case 0:
                    IO.println("Exiting...");
                    break;

                default:
                    IO.println("Invalid operation!");
            }

        } while (option != 0);
    }
}