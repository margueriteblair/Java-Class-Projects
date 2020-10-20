package com.margieblair;

public class DebitCard {
    private int pin;
    private CheckingAccount primary;
    private int cvv;
    private String owner;
    private String cardNumber;
    private List<SavingsAccount> atmAccounts;

    public DebitCard(String cardNumber, int pin, int cvv, String owner, CheckingAccount primary, List atmAccounts) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cvv = cvv;
        this.owner = owner;
        this.primary = primary;
        this.atmAccounts = atmAccounts;
    }

}
