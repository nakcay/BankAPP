package BankApp.Accounts;

import java.util.Random;

public abstract class Account {

    /*
    * This class is an abstract class.
    * Create the fields below and their getters and setters
    *
    * private String accountNumber;
    * private double balance;
    * private String accountType;
    *
    * Create a constructor with a String accountType parameter.
    * Set balance to 0 in the constructor
    *
    * Assign a random number between 1000000-10000000 to accountNumber.
    * Create this number in setAccountNumber method and return the number. Assign it to accountNumber in the constructor by
    * calling setAccountNumber method.
    *
    * In the setAccountType method change the return type to String and pass the String accountType parameter that you are getting by the constructor to this method
    * and make it all uppercase and assign it to object's accountType variable.
    *
    * Create 2 public abstract methods, names are addMoney and withdrawMoney.
    * addMoney and withdrawMoney have double amount parameter.
    *
    * */
    private String accountNumber;
    private double balance;
    private String accountType;

    public Account(String accountType) {
        this.accountType = setAccountType(accountType);
        setAccountNumber();
        balance = 0;
    }

    private String setAccountNumber() {
        Random rand = new Random();
        accountNumber = String.valueOf((rand.nextInt(10000000 - 1000000 + 1) + 1000000));
        return accountNumber;
    }

    private String setAccountType(String accountType) {
        return accountType.toUpperCase();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public abstract void addMoney(double amount);

    public abstract void withdrawMoney(double amount);
}




