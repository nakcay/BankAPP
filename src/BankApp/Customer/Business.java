package BankApp.Customer;

import week9.BankApp.Accounts.Checking;
import week9.BankApp.Accounts.Credit;

public class Business extends Customer{

    /* This class inherits from Customer class. It has private int annualIncome variable.
    * Create a constructor with parameters String customerName and int annualNetIncome.
    * Assign annualIncome to annualIncome.
    *
    * Create a setCreditLimit method with an int annualIncome parameter. Return type is double.
    * Set creditLimit to %30 of annualIncome setCreditLimit and assign it to creditLimit variable in the constructor.
    *
    * Implement all necessary methods.
    *
    * In openAccount method
    *           if accountType is checking, create a checking account and add it to the accounts list.
    *           if accountType is saving, print "Business customers cannot have saving accounts"
    *           if accountType is credit, create a credit account and add it to the accounts list.
    */
    private int annualIncome;

    public Business(String customerName, int annualIncome) {
        super(customerName);
        this.annualIncome = annualIncome;
        this.setCreditLimit(setCreditLimit(annualIncome));
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double setCreditLimit(int annualIncome) {
        this.setCreditLimit(annualIncome * 0.3);
        return getCreditLimit();
    }

    @Override
    public void openAccount(String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            accountType = String.valueOf(new Checking());
            this.getAccounts().add(new Checking());
        } else if (accountType.equalsIgnoreCase("saving")) {
            System.out.println("Business customers cannot have saving accounts");
        } else if (accountType.equalsIgnoreCase("credit")) {
            Credit creditAccount = new Credit();
            this.getAccounts().add(creditAccount);
        } else {
            System.out.println("Invalid account type");
        }
    }
}


