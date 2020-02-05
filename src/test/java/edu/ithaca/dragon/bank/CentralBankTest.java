package edu.ithaca.dragon.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CentralBankTest {

    @Test
    void checkBalanceTest() {
        CheckingAccount test = new CheckingAccount("testAcc", 100);
        assertEquals(100, test.checkBalance());
    }

}
