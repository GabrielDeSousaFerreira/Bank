package menu;

import entities.Account;
import services.UserAccountService;

import java.util.*;

public class LoginMenu {

    private static final String HEADER =
            "=====================================\n" +
            "===       WELCOME TO GB BANK      ===\n" +
            "=====================================";

    public void loginScreen(UserAccountService accountService, Scanner sc){

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

            IO.println("Document or password incorrect!");
            IO.println("1 - Try again");
            IO.println("2 - Create account");

            int option = sc.nextInt();
            sc.nextLine();

            if (option == 2){
                accountService.createUser(sc);
            }
        }
    }
}