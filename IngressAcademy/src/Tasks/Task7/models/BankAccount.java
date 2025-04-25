package Tasks.Task7.models;

import Tasks.Task7.interfaces.AccountOperations;

public abstract class BankAccount implements AccountOperations {
    protected String accountNumber;
    protected String pinCode;
    protected double balance;
    protected String ownerName;

    public BankAccount(String ownerName, String accountNumber, String pinCode) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.balance = 500.0; // default balance
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public void deposit(double amount) {

    }

//    @Override
//    public void withdraw(double amount) {
//    }

    @Override
    public void withdraw() {

    }


//    @Override
//    public String showBalance() {
//        System.out.println("Balans: " + balance + " AZN");
//    }

    @Override
    public void showBalance(double balance) {
        System.out.println("Balans: " + balance + " AZN");
    }
}