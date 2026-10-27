package minibank.service;

import minibank.model.Account;
import java.util.ArrayList;
import java.util.List;

public class BankService {
    private final List<Account> accounts = new ArrayList<>();

    public void addAccount(String name, double openingBalance) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative");
        }
        accounts.add(new Account(name, openingBalance));
    }

    public void deposit(String name, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        findAccount(name).deposit(amount);
    }

    public Account findAccount(String name) {
        for (Account a : accounts) {
            if (a.getName().equalsIgnoreCase(name)) {
                return a;
            }
        }
        throw new IllegalArgumentException("Account not found: " + name);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public int count() {
        return accounts.size();
    }
}
