package menu;

import entities.Account;
import services.AccountService;
import services.BusinessAccountService;
import services.UserAccountService;

import java.util.Scanner;

public class LoginMenu {
    private UserAccountService userAccountService;
    private BusinessAccountService businessAccountService;
    private AccountService accountService;

    public LoginMenu(AccountService accountService, UserAccountService userAccountService, BusinessAccountService businessAccountService) {
        this.accountService = accountService;
        this.userAccountService = userAccountService;
        this.businessAccountService = businessAccountService;
    }

    private static final String HEADER =
            "=====================================\n" +
            "===       WELCOME TO GB BANK      ===\n" +
            "=====================================";

    public void loginScreen(Scanner sc){

        while (true){
            IO.println(HEADER);

            IO.print("CPF/CNPJ: ");
            String document = sc.nextLine();

            IO.print("Password: ");
            String password = sc.nextLine();

            Account account = accountService.login(document, password);

            if (account != null){
                BankMenu bankMenu = new BankMenu();
                bankMenu.mainBank(account, sc);
                break;
            }

            IO.println("CPF/CNPJ or password incorrect!");
            IO.println("1 - Try again");
            IO.println("2 - Create account");

            int option = sc.nextInt();
            sc.nextLine();

            if (option == 2){
                IO.println("\n1- User account");
                IO.println("2- Business account");
                int opc = sc.nextInt();

                if (opc == 1) {
                    userAccountService.createUser(sc);
                } else if (opc == 2) {
                    businessAccountService.createBusinessAccount(sc);
                }
            }
        }
    }
}