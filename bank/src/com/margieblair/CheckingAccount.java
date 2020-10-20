package com.margieblair;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(int accountNumber, int balance, String owner, String typeOfAccount) {
        super(accountNumber, balance, owner, "Checking");
    }
}
