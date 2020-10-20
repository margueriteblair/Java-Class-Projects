package com.margieblair;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount myBankAccount = new BankAccount(5050202, 40000, "Margie", "Checking");
        SavingsAccount mySavingsAccount = new SavingsAccount();
        System.out.println(myBankAccount.getDetails());
        myBankAccount.deposit(599);
        System.out.println(myBankAccount.getDetails());

    }
}
