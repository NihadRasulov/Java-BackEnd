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

        System.out.println("Hesab növünü seçin:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("3. Fixed Deposit Account");
        int type = sc.nextInt();

        String accNum = AccountGenerator.generateAccountNumber();
        String pin = AccountGenerator.generatePin();
        System.out.println("Hesab nömrəniz: " + accNum);
        System.out.println("PIN kodunuz: " + pin);

        switch (type) {
            case 1 -> userAccount = new SavingsAccount(name, accNum, pin);
            case 2 ->userAccount = new CurrentAccount(name, accNum, pin);
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

                default -> System.out.println("Yanlış seçim.");
            }
        } while (choice != 5);
    }
}
