package edu.ithaca.dragon.bank;

public class CheckingAccount {

    private String acctId;
    private double balance;

    public CheckingAccount(String acctId, double startingBalance) {
        //if (isAmountValid(startingBalance)){
            this.balance = startingBalance;
            this.acctId = acctId;
        //}

        //else {
        //    throw new IllegalArgumentException("Dollar Amount: " + startingBalance + " is invalid, cannot create account");
        //}
    }

    public double checkBalance() {
        return balance;
    }

    public String getAcctId() { return acctId; }







}
