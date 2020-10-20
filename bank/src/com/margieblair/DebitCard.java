package com.margieblair;

public class DebitCard {
    private String pin; //ints cant handle leadings 0's
    //we also don't need to do any math on this
    private CheckingAccount primary;
    private int cvv;
    private String cardOwner;
    private String cardNumber;
    private List<Account> atmAccounts;


    public DebitCard(String cardNumber, int pin, int cvv, String cardOwner, CheckingAccount primary, List atmAccounts) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cvv = cvv;
        this.cardOwner = cardOwner;
        this.primary = primary;
        this.atmAccounts = atmAccounts;
    }

}
