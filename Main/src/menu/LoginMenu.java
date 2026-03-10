package menu;

import entities.UserAccount;
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
            IO.print("CPF: ");
            String cpf = sc.nextLine();
            IO.print("Password: ");
            String password = sc.nextLine();

            UserAccount user = accountService.login(cpf, password);

            if (user != null){
                BankMenu bankMenu = new BankMenu();
                bankMenu.mainBank(user, sc);
                break;
            }

            IO.println("CPF or password incorrect!");
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
