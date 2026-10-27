package minibank.model;

public class Account {
    private final String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() { return name; }

    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return name + " : " + balance;
    }
}
