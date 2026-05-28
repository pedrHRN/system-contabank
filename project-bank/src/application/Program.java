package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import menu.Menu;
import services.AccountService;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        AccountService service = new AccountService();

        Account account = Menu.createAccount(sc);

        Menu.start(sc, service, account);

        sc.close();
    }
}