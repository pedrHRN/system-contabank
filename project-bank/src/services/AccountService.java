package services;

import entities.Account;

public class AccountService {

    public void deposit(Account account, double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }

        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo.");
        }

        if (account.getBalance() < amount + 5.0) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar esta transação.");
        }

        account.withdraw(amount);
    }
}