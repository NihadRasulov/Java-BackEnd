package MentorLessons.Lesson3;

import java.util.Scanner;

public class BankAccount {

    int accountNumber;
    double balance;

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

    public void withdraw(double amount) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (amount < 0) {
                System.out.println("Invalid withdrawal amount");
                System.out.print("Please enter a positive number: ");
                amount = sc.nextDouble();
                continue;
            } else {
                if (balance - amount < 0) {
                    System.out.println("Your balance is " + balance);
                    System.out.println("Insufficient balance");
                    System.out.print("Please enter a positive number: ");
                    amount = sc.nextDouble();
                    continue;
                } else {
                    System.out.println("Before your balance is " + balance);
                    balance -= amount;
                    System.out.println("You withdraw " + amount + " New balance: " + balance);
                }
            }
            break;
        }
    }
    public void transfer(double transferAmount) {
        balance -= transferAmount;
    }

//    public void transfer(double transferAmount) {
//
//        while (true) {
//                System.out.println("Your current balance is " + balance);
//                balance = balance - transferAmount;
//                System.out.println("You transfer " + transferAmount + " New balance: " + balance);
//            break;
//        }
//    }
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = 1234;
        bankAccount.balance = 1000;

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.balance = 100;


        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the account number to transfer: ");
            int accountNumber = scanner.nextInt();
            if (accountNumber != bankAccount.accountNumber) {
                System.out.println("Invalid account number!");
                System.out.print("Please enter a valid account number: ");
                scanner.nextInt();
                continue;
            }
            else {
                System.out.print("Please enter how much you want to transfer: ");
                double transferNumber = scanner.nextDouble();
                if (transferNumber > bankAccount.balance || transferNumber<0) {
                    System.out.println("Invalid transfer amount!");
                    System.out.print("Please enter a valid transfer amount: ");
                    scanner.nextDouble();
                    continue;
                }
                bankAccount.transfer(transferNumber);
            }
            break;
        }

//        bankAccount1.balance = 10;
//        bankAccount1.accountNumber = 1234;
//        System.out.print("Please enter your balance: ");
//        bankAccount.balance = scanner.nextDouble();
////        System.out.print("Please enter how much you want to deposit: ");
////        bankAccount.deposit(scanner.nextDouble());
//
//
//
//        System.out.print("Please enter how much you want to transfer: ");
//        double transferAmount = scanner.nextDouble();
//
//        while(true) {
//            Scanner sc = new Scanner(System.in);
//            if (bankAccount.balance < transferAmount || transferAmount < 0) {
//                System.out.println("Invalid transfer amount");
//                System.out.print("Please enter a valid number: ");
//                transferAmount = sc.nextDouble();
//            }
//            System.out.print("Please enter account number to transfer: ");
//            int bankAccountNumber = sc.nextInt();
//            if (bankAccountNumber == bankAccount1.accountNumber) {
//                bankAccount.transfer(transferAmount);
//            }
//            else {
//                System.out.println("Insufficient account number");
//                System.out.print("Please enter a valid account number: ");
//                sc.nextDouble();
//            }
//            break;
//        }
//        System.out.println("Before your balance is " + bankAccount.balance);
//        bankAccount.balance = bankAccount.balance - transferAmount;
//        System.out.println("You transfer " + transferAmount + " New balance: " + bankAccount.balance);
//
//
//        System.out.println("Your current balance is " + bankAccount1.balance);
//
//        bankAccount1.balance = bankAccount1.balance + transferAmount;
//        System.out.println("You have transfer " + transferAmount + " New balance: " + bankAccount1.balance);
//
//
////        System.out.print("Please enter how much you want to withdraw: ");
////        bankAccount.withdraw(scanner.nextDouble());

    }
}
