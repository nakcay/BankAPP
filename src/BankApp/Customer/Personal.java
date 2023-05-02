package BankApp.Customer;

import week9.BankApp.Accounts.Checking;
import week9.BankApp.Accounts.Credit;
import week9.BankApp.Accounts.Saving;


public class Personal extends Customer{

    /* This class inherits from Customer class. It has private int annualSalary variable.
     * Create a constructor with parameters String customerName and int annualSalary.
     * Assign annualSalary to annualSalary.
     *
     * Create a setCreditLimit method with an int annualSalary parameter. Return type is double.
     * Set creditLimit to  %10 of annualSalary in setCreditLimit and assign it to creditLimit variable in the constructor.
     *
     * Implement all necessary methods.
     *
     * In openAccount method
     *           if accountType is checking, create a checking account and add it to the accounts list.
     *           if accountType is saving, create a saving account and add it to the accounts list.
     *           if accountType is credit, create a credit account and add it to the accounts list.
     */
    private int annualSalary;

    public Personal(String customerName, int annualSalary) {
        super(customerName);
        this.annualSalary = annualSalary;
        this.setCreditLimit(annualSalary);
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double setCreditLimit(int annualSalary) {
        this.setCreditLimit(annualSalary * 0.1);
        return getCreditLimit();
    }

    @Override
    public void openAccount(String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            Checking checkingAccount = new Checking();
            this.getAccounts().add(checkingAccount);
        } else if (accountType.equalsIgnoreCase("saving")) {
            Saving savingAccount = new Saving();
            this.getAccounts().add(savingAccount);
        } else if (accountType.equalsIgnoreCase("credit")) {
            Credit creditAccount = new Credit();
            this.getAccounts().add(creditAccount);
        } else {
            System.out.println("Invalid account type");
        }
    }
}

