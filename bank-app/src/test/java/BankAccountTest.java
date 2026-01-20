import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void depositShouldIncreaseBalance() {

        BankAccount account = new BankAccount();

        int result = account.deposit(100, 50);


        assertEquals(150, result, "Баланс має бути 150 після депозиту");
    }
}