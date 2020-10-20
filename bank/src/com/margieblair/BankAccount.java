package com.margieblair;

public class BankAccount {
    private int accountNumber;
    private String owner;
    protected int balance; //this is the class balance
    private String typeOfAccount; //we don't want to deal with decimal based math

    //this is the method balance
    public BankAccount(int accountNumber, int balance, String owner, String typeOfAccount) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
        this.type = type;
    }
    //scope, class scope is private, project level scope is ppublic

    public void deposit(int depAmount) {
        balance += depAmount;
    }

    public void withdraw(int withdrawAmt) {
        if (balance >= withdrawAmt && this.accountNumber == accountNumber) {
            balance -= withdrawAmt;
            return;
        }
    }

    public String getDetails() {
        return type + "- Owner: " + owner + "\nAccount number: " + accountNumber + "\nBalance" + balance;
        //\t is indicating a tab, escaping system using a backslash
    }
}
