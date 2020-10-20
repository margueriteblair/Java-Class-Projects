package com.margieblair;

public class SavingsAccount extends BankAccount {
    private double interest;

    public SavingsAccount(int accountNumber, int balance, String owner, String typeOfAccount) {
        super(accountNumber, balance, owner, "Savings");
    }

    public void applyInterest() {
        balance += ((int) balance * ((float) interest / 100.0));
    }
}
