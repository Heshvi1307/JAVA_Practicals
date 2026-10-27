package minibank.storage;

import minibank.model.Account;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountStorageTest {

    @TempDir
    Path tempDir;

    @Test
    void saveThenLoadGivesSameData() throws Exception {
        AccountStorage storage = new AccountStorage();
        Path file = tempDir.resolve("accounts.txt");

        List<Account> original = List.of(
                new Account("Asha", 100.5),
                new Account("Ravi", 250));

        storage.save(original, file);
        List<Account> loaded = storage.load(file);

        assertEquals(2, loaded.size());
        assertEquals("Asha", loaded.get(0).getName());
        assertEquals(100.5, loaded.get(0).getBalance());
        assertEquals("Ravi", loaded.get(1).getName());
        assertEquals(250, loaded.get(1).getBalance());
    }
}
