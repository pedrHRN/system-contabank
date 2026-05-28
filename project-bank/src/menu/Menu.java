package menu;

import java.util.Scanner;

import entities.Account;
import services.AccountService;

public class Menu {

    public static Account createAccount(Scanner sc) {

        System.out.println("=================================");
        System.out.println("        CRIAÇÃO DE CONTA");
        System.out.println("=================================\n");

        System.out.print("Insira o número da conta: ");
        int number = sc.nextInt();

        System.out.print("Insira o titular da conta: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Existe depósito inicial? (sim/nao): ");
        String decision = sc.next();

        if (decision.equalsIgnoreCase("sim")) {
        	System.out.println();
            System.out.print("Digite o valor do depósito inicial: ");
            double initialDeposit = sc.nextDouble();

            return new Account(number, holder, initialDeposit);
        }

        return new Account(number, holder);
    }

    public static void start(Scanner sc, AccountService service, Account account) {

        int option;

        do {

            showMenu();

            option = sc.nextInt();

            switch(option) {

                case 1:
                    deposit(sc, service, account);
                    break;

                case 2:
                    withdraw(sc, service, account);
                    break;

                case 3:
                    showAccountData(sc, account);
                    break;

                case 4:

                    System.out.println("\nEncerrando sistema...");
                    break;

                default:

                    System.out.println("\nOpção inválida.");
                    pause(sc);
            }

        } while(option != 4);
    }

    private static void showMenu() {

        System.out.println("\n=================================");
        System.out.println("              MENU");
        System.out.println("=================================");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver dados da conta");
        System.out.println("4 - Sair");
        System.out.println("=================================");

        System.out.print("Escolha uma opção: ");
    }

    private static void deposit(Scanner sc, AccountService service, Account account) {

        System.out.println("\n========== DEPÓSITO ==========\n");

        System.out.print("Digite o valor do depósito: ");
        double amount = sc.nextDouble();

        service.deposit(account, amount);

        System.out.println("\nDepósito realizado com sucesso.");

        pause(sc);
    }

    private static void withdraw(Scanner sc, AccountService service, Account account) {

        System.out.println("\n=========== SAQUE ===========\n");

        System.out.print("Digite o valor do saque: ");
        double amount = sc.nextDouble();

        service.withdraw(account, amount);

        System.out.println("\nSaque realizado com sucesso.");

        pause(sc);
    }

    private static void showAccountData(Scanner sc, Account account) {

        System.out.println("\n=================================");
        System.out.println("         DADOS DA CONTA");
        System.out.println("=================================\n");

        System.out.println(account);

        pause(sc);
    }

    private static void pause(Scanner sc) {

        System.out.println("\nPressione ENTER para continuar...");
        sc.nextLine();
        sc.nextLine();
    }
}