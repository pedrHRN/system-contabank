package entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance = 0.0;

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(Integer number, String holder, Double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
    	return  "Número da conta: " + number
                + "\nTitular: " + holder
                + "\nSaldo: R$ "
                + String.format("%.2f", balance);
    }
}