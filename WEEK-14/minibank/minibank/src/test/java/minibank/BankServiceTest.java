package minibank;

import minibank.service.BankService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceTest {

    @Test
    void addingAccountIncreasesCount() {
        BankService bank = new BankService();
        bank.addAccount("Asha", 100);
        assertEquals(1, bank.count());
    }

    @Test
    void depositIncreasesBalance() {
        BankService bank = new BankService();
        bank.addAccount("Asha", 100);
        bank.deposit("Asha", 50);
        assertEquals(150, bank.findAccount("Asha").getBalance());
    }

    @Test
    void invalidDepositThrows() {
        BankService bank = new BankService();
        bank.addAccount("Asha", 100);
        assertThrows(IllegalArgumentException.class, () -> bank.deposit("Asha", -10));
    }

    @Test
    void unknownAccountThrows() {
        BankService bank = new BankService();
        assertThrows(IllegalArgumentException.class, () -> bank.deposit("Nobody", 10));
    }
}
