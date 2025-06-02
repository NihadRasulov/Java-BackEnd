package Default;

import java.util.ArrayList;
import java.util.Scanner;

public class MyTask {

    static String accountNumber = "1234 1122";
    static double balance = 1000;
    static Scanner sc = new Scanner(System.in); // Use one Scanner

    public static void deposit(double amount) {
        while (true) {
            if (amount < 0) {
                System.out.println("Invalid deposit amount");
                System.out.print("Please enter a positive number: ");
                amount = sc.nextDouble();
            } else {
                System.out.println("Before your balance is " + balance);
                balance += amount;
                System.out.println("You deposited " + amount + ". Default.New balance is " + balance);
                break;
            }
        }
    }

    public static void withdraw(double amount) {
        while (true) {
            if (amount < 0) {
                System.out.println("Invalid withdrawal amount");
                System.out.print("Please enter a positive number: ");
                amount = sc.nextDouble();
            } else if (balance - amount < 0) {
                System.out.println("Your balance is " + balance);
                System.out.print("Insufficient balance. Please enter a valid number: ");
                amount = sc.nextDouble();
            } else {
                System.out.println("Before your balance is " + balance);
                balance -= amount;
                System.out.println("You withdrew " + amount + ". Default.New balance: " + balance);
                break;
            }
        }
    }

//    public static void transfer(ArrayList<String> accountNumbers, ArrayList<String> accountNames, ArrayList<Integer> accountBalances) {
//        System.out.print("Please enter an account number to transfer:");
//        String inputAccountNumber = sc.next();
//        System.out.print("Please enter the account name: ");
//        String inputName = sc.next();
//
//        boolean found = true;
//        for (int i = 0; i < accountNumbers.size(); i++) {
//            if (accountNumbers.get(i).equals(inputAccountNumber) && accountNames.get(i).equalsIgnoreCase(inputName)) {
//                System.out.print("Enter the amount to transfer: ");
//                int transferAmount = sc.nextInt();
//
//                if (transferAmount > balance || transferAmount < 0) {
//                    System.out.println("Insufficient balance! Your balance is " + balance);
//                } else {
//                    balance -= transferAmount;
//                    accountBalances.set(i, accountBalances.get(i) + transferAmount);
//                    System.out.println("You transferred " + transferAmount + " to " + accountNames.get(i) + ". Default.New balance: " + balance);
//                }
//                found = false;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("Invalid account number or name. Please try again.");
//        }
//    }

    public static void displayMenu() {
        System.out.println("\n1. Withdraw balance");
        System.out.println("2. Deposit balance");
        System.out.println("3. Transfer money to another account");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    public static void main(String[] args) {
        ArrayList<String> accountNumbers = new ArrayList<>();
        accountNumbers.add("12341234");
        accountNumbers.add("12341121");
        accountNumbers.add("12341233");

        ArrayList<String> accountNames = new ArrayList<>();
        accountNames.add("NihatRasulov");
        accountNames.add("AliShukurov");
        accountNames.add("MuradMammadli");

        ArrayList<Integer> accountBalances = new ArrayList<>();
        accountBalances.add(2000);
        accountBalances.add(1500);
        accountBalances.add(3000);

        boolean running = true;
        while (running) {
            displayMenu();
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    deposit(sc.nextDouble());
                    break;
                case 3:
//                    transfer(accountNumbers, accountNames, accountBalances);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close(); // Close scanner when exiting
    }
}
