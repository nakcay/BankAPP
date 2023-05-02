package BankApp.Accounts;

public class Credit extends Account{

    /* This class inherits from Account class. It has private double creditLimit and private double transactionFee variables.
    * Create a constructor with creditLimit parameter. Pass "credit" value to the super. assign creditLimit coming from the constructor to the creditLimit variable
    * and set the transactionFee to %3
    *
    * Implement all necessary methods.
    *
    * In addMoney method decrease the amount by %transactionFee and add it to the balance if the amount is equal or bigger than 0,
    * otherwise print "You cannot add negative amount".
    *
    * In withdrawMoney method decrease balance by amount and %transactionFee of the amount if balance is equal or greater than the total amount,
    * otherwise print "Insufficient balance"
    * */
    private double creditLimit;
    private double transactionFee;

    public Credit() {
        super("Credit");
        this.creditLimit = creditLimit;
        transactionFee = 0.03;
    }

    @Override
    public void addMoney(double amount) {
        if (amount >= 0) {
            setBalance(getBalance() - transactionFee);
        } else {
            System.out.println("You can not add negative amount!");
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount >= 0) {
            setBalance(getBalance() - transactionFee);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
