package com.margieblair;

public class BankAccount {
    private int accountNumber;
    private String owner;
    protected int balance;
    private String typeOfAccount;

    public BankAccount(int accountNumber, int balance, String owner, String typeOfAccount) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
        this.type = type;
    }

    public void deposit(int depAmount) {
        balance += depAmount;
    }

    public void withdraw(int withdrawAmt) {
        balance -= withdrawAmt;
    }

    public String getDetails() {
        return type + "- Owner: " + owner + "\nAccount number: " + accountNumber + "\nBalance" + balance;
    }
}
