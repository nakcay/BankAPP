package BankApp.Accounts;

public class Checking extends Account{

    /* This class inherits from Account class. It has no additional variables.
    * Create a constructor without any parameters. Pass "checking" string argument to the super.
    *
    * Implement all necessary methods.
    *
    * In addMoney method add amount to balance if it is equal or greater than 0, otherwise print "You cannot add negative amount"
    *
    * In withdrawMoney method subtract amount from balance if balance is greater than amount, otherwise print "Insufficient balance"
    * */
    public Checking() {
        super("checking");
    }

    @Override
    public void addMoney(double amount) {
        if (amount >= 0) {
            setBalance(getBalance() + amount);
        } else {
            System.out.println("You cannot add negative amount");
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        if (getBalance() > amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

}
