package minibank.storage;

import minibank.model.Account;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AccountStorage {

    // Each line in the file looks like: name,balance
    public void save(List<Account> accounts, Path file) throws IOException {
        List<String> lines = new ArrayList<>();
        for (Account a : accounts) {
            lines.add(a.getName() + "," + a.getBalance());
        }
        Files.write(file, lines);
    }

    public List<Account> load(Path file) throws IOException {
        List<Account> accounts = new ArrayList<>();
        if (!Files.exists(file)) {
            return accounts;   // first run: nothing saved yet
        }
        for (String line : Files.readAllLines(file)) {
            String[] parts = line.split(",");
            accounts.add(new Account(parts[0], Double.parseDouble(parts[1])));
        }
        return accounts;
    }
}
