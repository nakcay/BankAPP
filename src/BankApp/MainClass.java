package BankApp;


import week9.BankApp.Customer.Business;
import week9.BankApp.Customer.Personal;

public class MainClass {
    public static void main(String[] args) {

        Bank bank = new Bank("Techno Bank");
        bank.addCustomer(new Personal("Jason", 120000));
        /* Create a checking account for Jason and deposit $200 and withdraw $50. Check the balance. It must be $150


         * Withdraw $150 and then try to delete this account. You must see the success message
         * Create a saving account for this customer, deposit $200, withdraw $50 and apply interest. Check the balance. It must be $151.7425
         * Try to delete this account. You must see "You have $151.7425 in your account. Withdraw your money first"
         * Create a checking account for this customer, deposit $200, withdraw $50. Check the balance. It must be $142.5
         * Withdraw $200 and try to delete this account. You must see "You cannot close credit account without paying your debt" message
         * Try to delete this customer. You must see "This customer has either money or debt in one of his/her accounts." message
         */


        bank.addCustomer(new Business("Google", 50000000));
        /* Create a checking account for Google. Deposit $200 and withdraw $200. Try to delete this customer.
         * You must see "Customer has been deleted successfully" message
         */


        // Challenge : Add a menu with options open account, close account, add customer, delete customer,
        // deposit money, withdraw money, exit and let the user choose one of the options and
        // do the transaction.


        // Create a checking account for Jason


    }}
