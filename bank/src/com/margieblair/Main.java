package com.margieblair;

import bank.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount myBankAccount = new BankAccount(5050202, 40000, "Margie", "Checking");
        SavingsAccount mySavingsAccount = new SavingsAccount();
        System.out.println(myBankAccount.getDetails());
        myBankAccount.deposit(599);
        System.out.println(myBankAccount.getDetails());
        List<SavingsAccount> savingsList = new ArrayList<SavingsAccount>();

        DebitCard myCard = new DebitCart("1234 1234 2344 1111","1234", "223", "Margie", myBankAccount, savingsList);

    }
}
