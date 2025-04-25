package Tasks.Task7;

import Tasks.Task7.models.BankAccount;
import Tasks.Task7.models.CurrentAccount;
import Tasks.Task7.models.FixedDepositAccount;
import Tasks.Task7.models.SavingsAccount;
import Tasks.Task7.utils.AccountGenerator;

import java.util.Scanner;

public class BankSystemApp {
    private static BankAccount userAccount;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Bank Sisteminə Xoş Gəldiniz ===");

        System.out.print("Adınızı daxil edin: ");
        String name = sc.nextLine();

        String accNum = AccountGenerator.generateAccountNumber();
        String pin = AccountGenerator.generatePin();
        System.out.println("Hesab nömrəniz: " + accNum);
        System.out.println("PIN kodunuz: " + pin);

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("3. Fixed Deposit Account");
        System.out.print("Hesab növünü seçin:");

        int type = sc.nextInt();

        switch (type) {
            case 1 -> userAccount = new SavingsAccount(name, accNum, pin);
            case 2 -> userAccount = new CurrentAccount(name, accNum, pin);
            case 3 -> userAccount = new FixedDepositAccount(name, accNum, pin);
            default -> {
                System.out.println("Yanlış seçim. Savings seçildi.");
                userAccount = new SavingsAccount(name, accNum, pin);
            }
        }

        System.out.println("\nZəhmət olmasa daxil olun.");
        int attempts = 3;
        while (attempts > 0) {
            System.out.print("PIN daxil edin: ");
            String enteredPin = sc.next();
            if (enteredPin.equals(userAccount.getPinCode())) {
                System.out.println("Uğurla daxil oldunuz, " + userAccount.getOwnerName() + "!");
                break;
            } else {
                attempts--;
                System.out.println("Yanlış PIN. Qalan cəhd sayı: " + attempts);
                if (attempts == 0) {
                    System.out.println("Çoxlu sayda uğursuz cəhd. Sistem bağlandı.");
                    return;
                }
            }
        }

        int choice;
        do {
            System.out.println("\n=== Əsas Menyu ===");
            System.out.println("1. Balansa bax");
            System.out.println("2. Pul yatır");
            System.out.println("3. Pul çıxar");
            System.out.println("4. Faiz hesabla");
            System.out.println("5. Çıxış");
            System.out.print("Seçiminiz: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    if (type == 1) {
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.showBalance();
                    } else if (type == 2) {
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.showBalance();
                    } else if (type == 3) {
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.showBalance();
                    } else {
                        System.out.println("Default Account Choosing.Saving Account!");
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.showBalance();
                    }
                }
                case 2 -> {
                    if (type == 1) {
                        System.out.print("Please enter how much you want to deposit: ");
                        double amount = sc.nextDouble();
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.showBalance();
                        userAccount.deposit(amount);
                        System.out.println("After deposit to balance: ");
                        userAccount.showBalance();
                    } else if (type == 2) {
                        System.out.print("Please enter how much you want to deposit: ");
                        double amount = sc.nextDouble();
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.showBalance();
                        userAccount.deposit(amount);
                        System.out.println("After deposit to balance: ");
                        userAccount.showBalance();
                    } else if (type == 3) {
                        System.out.print("Please enter how much you want to deposit: ");
                        double amount = sc.nextDouble();
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.showBalance();
                        userAccount.deposit(amount);
                        System.out.println("After deposit to balance: ");
                        userAccount.showBalance();
                    } else {
                        System.out.println("Default Account Choosing.Saving Account!");
                        System.out.print("Please enter how much you want to deposit for default account: ");
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        double amount = sc.nextDouble();
                        userAccount.showBalance();
                        userAccount.deposit(amount);
                        System.out.println("After deposit to balance: ");
                        userAccount.showBalance();
                    }
                }
                case 3 -> {
                    if (type == 1) {
                        System.out.print("Please enter how much you want to deposit: ");
                        double amount = sc.nextDouble();
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.showBalance();
                        userAccount.withdraw(amount);
                        System.out.println("After deposit to balance: ");
                        userAccount.showBalance();
                    } else if (type == 2) {
                        System.out.print("Please enter how much you want to deposit: ");
                        double amount = sc.nextDouble();
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.showBalance();
                        userAccount.withdraw(amount);
                        System.out.println("After deposit to balance: ");
                        userAccount.showBalance();
                    } else if (type == 3) {
                        System.out.print("Please enter how much you want to deposit: ");
                        double amount = sc.nextDouble();
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.showBalance();
                        userAccount.withdraw(amount);
                        System.out.println("After deposit to balance: ");
                        userAccount.showBalance();
                    } else {
                        System.out.println("Default Account Choosing.Saving Account!");
                        System.out.print("Please enter how much you want to deposit for default account: ");
                        double amount = sc.nextDouble();
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.showBalance();
                        userAccount.withdraw(amount);
                        System.out.println("After deposit to balance: ");
                        userAccount.showBalance();
                    }
                }
                case 4 -> {
                    if (type == 1) {
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.calculateInterest();
                    } else if (type == 2) {
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.calculateInterest();
                    } else if (type == 3) {
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.calculateInterest();
                    } else {
                        System.out.println("Default Account Choosing.Saving Account!");
                        System.out.println("Name: " + userAccount.getOwnerName() + "\nAccount Number: " + userAccount.getAccountNumber()
                                + "\nAccount PIN: " + userAccount.getPinCode());
                        userAccount.calculateInterest();
                    }
                }
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Yanlış seçim.");
            }
        } while (choice != 5);
    }
}
