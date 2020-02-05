package edu.ithaca.dragon.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CentralBankTest {

    @Test
    void checkBalanceTest(){
        CheckingAccount bankAccount = new CheckingAccount("ioan ", 100.0);

        assertEquals(100, bankAccount.getBalance());
    }


}
