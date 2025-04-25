package Tasks.Task7.models;

import Tasks.Task7.interfaces.AccountOperations;

import java.util.Scanner;

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
        while (true) {
            if (amount < 0) {
                System.out.println("Invalid deposit amount");
                System.out.print("Please enter a positive number: ");
                Scanner sc = new Scanner(System.in);
                amount = sc.nextDouble();
                continue;
            } else {
                System.out.println("Before your balance is " + balance);
                balance += amount;
                System.out.println("You deposit " + amount + " New balance is " + balance);
            }
            break;
        }
    }

//    @Override
//    public void withdraw(double amount) {
//    }

    @Override
    public void withdraw(double amount) {
        boolean check = true;
        while (check) {
            Scanner sc = new Scanner(System.in);
            if (amount < 0) {
                System.out.println("Invalid withdrawal amount");
                System.out.print("Please enter a positive number: ");
                amount = sc.nextDouble();
            } else {
                if (balance - amount < 0) {
                    System.out.println("Your balance is " + balance);
                    System.out.println("Insufficient balance");
                    System.out.print("Please enter a valid number: ");
                    amount = sc.nextDouble();
                } else {
                    System.out.println("Before your balance is " + balance);
                    balance -= amount;
                    System.out.println("You withdraw " + amount + " New balance: " + balance);
                    check = false;
                }
            }
        }

    }


//    @Override
//    public String showBalance() {
//        System.out.println("Balans: " + balance + " AZN");
//    }

//    @Override
//    public void showBalance(double balance) {
//        System.out.println("Balans: " + balance + " AZN");
//    }

    @Override
    public void showBalance() {
        System.out.println("Balans: " + balance + " AZN");
    }
}