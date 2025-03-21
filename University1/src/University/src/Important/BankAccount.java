package University.src.Important;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {

    static String accountNumber = "1234 1122";
    static double balance = 1000;


    public static void deposit(double amount) {
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

    public static void withdraw(double amount) {
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

    public static void transfer(ArrayList<String> accountNumbers, ArrayList<String> accountNames, ArrayList<Integer> accountBalances) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        while (check) {
            System.out.print("Enter the account number to transfer: ");
            String inputAccountNumber = sc.next();
            System.out.print("Enter the account name: ");
            String inputName = sc.next();

            boolean found = false;
            for (int i = 0; i < accountNumbers.size(); i++) {
                if (accountNumbers.get(i).equals(inputAccountNumber) && accountNames.get(i).equalsIgnoreCase(inputName)) {
                    System.out.print("Enter the amount to transfer: ");
                    int transferAmount = sc.nextInt();

                    while (transferAmount > balance || transferAmount < 0) {
                        System.out.println("Invalid amount. Your balance is " + balance);
                        System.out.print("Please enter a valid transfer amount: ");
                        transferAmount = sc.nextInt();
                    }

                    balance -= transferAmount;
                    accountBalances.set(i, accountBalances.get(i) + transferAmount);
                    System.out.println("You transferred " + transferAmount + " to " + accountNames.get(i) +
                            ". New balance: " + balance);
                    found = true;
                    check = false;
                }
            }
            if (!found) {
                System.out.println("Invalid account number or name. Please try again.");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("1. Withdraw balance");
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

        Scanner sc = new Scanner(System.in);

        boolean check = true;
        while (check) {
            displayMenu();
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter how much you want to withdraw: ");
                    int amountOfWithdraw = sc.nextInt();
                    withdraw(amountOfWithdraw);
                    break;
                case 2:
                    System.out.print("Enter how much you want to deposit: ");
                    int amountOfDeposit = sc.nextInt();
                    deposit(amountOfDeposit);
                    break;
                case 3:
                    transfer(accountNumbers, accountNames, accountBalances);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    check = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    System.out.print("Please enter valid option: ");
            }
        }
    }
}
