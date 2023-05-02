package BankApp.Customer;

import week9.BankApp.Accounts.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Customer {

    /* This class is an abstract class.
     * Create the fields below and their getters and setters
     *
     * private String customerNumber;
     * private String customerName;
     * private double creditLimit;
     * private List<Account> accounts
     *
     * Create a constructor with customerName parameter and assign it to customerName variable.
     *
     * Assign a random number between 1000000-10000000 to customerNumber.
     * Create this number in setCustomerNumber method and return the number. Assign it to customerNumber in the constructor by
     * calling setCustomerNumber method.
     *
     * Initialize accounts list as an ArrayList in the constructor.
     *
     * Create an abstract openAccount method with a String accountType parameter.
     *
     * Create a non-abstract deleteAccount method with an Account parameter.
     * Delete this account from accounts list if its balance is 0.
     * If the balance is negative print "You cannot close credit account without paying your debt"
     * If the balance is positive print "You have $balance in your account. Withdraw your money first"
     */
    private String customerNumber;
    private String customerName;
    private double creditLimit;
    private List<Account> accounts;

    public Customer(String customerName) {
        this.customerName = customerName;
       this.accounts=new ArrayList<>();
       this.customerNumber=setCustomerNumber();
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    private String setCustomerNumber() {
        Random rand = new Random();
        int num = rand.nextInt(10000000 - 1000000) + 1000000;
        return String.valueOf(num);
    }

    public abstract void openAccount(String accountType);

    public void deleteAccount(Account account) {
        if (account.getBalance() == 0) {
            accounts.remove(account);
        } else if (account.getBalance() < 0) {
            System.out.println("You cannot close credit account without paying your debt");
        } else {
            System.out.println("You have $" + account.getBalance() + " in your account. Withdraw your money first");
        }
    }
}


