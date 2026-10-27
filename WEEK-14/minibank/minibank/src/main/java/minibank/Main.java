package minibank;

import minibank.model.Account;
import minibank.service.BankService;
import minibank.storage.AccountStorage;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BankService bank = new BankService();
        AccountStorage storage = new AccountStorage();
        Path file = Path.of("accounts.txt");

        // load saved accounts
        for (Account a : storage.load(file)) {
            bank.addAccount(a.getName(), a.getBalance());
        }

        Scanner in = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- MiniBank ---");
            System.out.println("1. Add account");
            System.out.println("2. Deposit");
            System.out.println("3. List accounts");
            System.out.println("0. Save and exit");
            System.out.print("Choose: ");
            String choice = in.nextLine();

            try {
                switch (choice) {
                    case "1" -> {
                        System.out.print("Name: ");
                        String name = in.nextLine();
                        System.out.print("Opening balance: ");
                        double bal = Double.parseDouble(in.nextLine());
                        bank.addAccount(name, bal);
                        System.out.println("Account added.");
                    }
                    case "2" -> {
                        System.out.print("Name: ");
                        String name = in.nextLine();
                        System.out.print("Amount: ");
                        double amt = Double.parseDouble(in.nextLine());
                        bank.deposit(name, amt);
                        System.out.println("Deposited.");
                    }
                    case "3" -> {
                        for (Account a : bank.getAccounts()) {
                            System.out.println(a);
                        }
                    }
                    case "0" -> {
                        storage.save(bank.getAccounts(), file);
                        System.out.println("Saved. Bye!");
                        running = false;
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
