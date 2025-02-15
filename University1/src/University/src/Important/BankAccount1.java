package University.src.Important;

import java.util.Scanner;

public class BankAccount1 {

    int accountNumber;
    double balance;

    public void deposit(double amount) {
        while(true) {
        if (amount < 0) {
            System.out.println("Invalid deposit amount");
            System.out.print("Please enter a positive number: ");
            Scanner sc = new Scanner(System.in);
            amount = sc.nextDouble();
            continue;
        }
        else {
            System.out.println("Before your balance is " + balance);
            balance += amount;
            System.out.println("You deposit " + amount +" New balance is " + balance);
        }
        break;
        }
    }

    public void withdraw(double amount) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            if (amount < 0) {
                System.out.println("Invalid withdrawal amount");
                System.out.print("Please enter a positive number: ");
                amount = sc.nextDouble();
                continue;
            }
            else {
                if (balance - amount < 0) {
                    System.out.println("Your balance is " + balance);
                    System.out.println("Insufficient balance");
                    System.out.print("Please enter a positive number: ");
                    amount = sc.nextDouble();
                    continue;
                }
                else {
                    System.out.println("Your balance is " + balance);
                    balance -= amount;
                    System.out.println("You withdraw " + amount +" New balance: " + balance);
                }
            }
            break;
        }
    }

    public static void main(String[] args) {

        BankAccount1 bankAccount = new BankAccount1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your balance: ");
        bankAccount.balance = scanner.nextDouble();
        System.out.print("Please enter how much you want to deposit: ");
        bankAccount.deposit(scanner.nextDouble());
        System.out.print("Please enter how much you want to withdraw: ");
        bankAccount.withdraw(scanner.nextDouble());

    }
}
