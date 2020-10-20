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

    public boolean charge(int amt, String pin) {
        if (this.pin == pin && primary.balance >= amt) {
            //we're only able to access our balance through primary
            primary.withdraw(amt);
            return true;
        }
        return false;
    }

}
