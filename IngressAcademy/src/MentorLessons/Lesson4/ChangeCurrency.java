package MentorLessons.Lesson4;

import java.util.Scanner;

public class ChangeCurrency {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the amount of money to change: ");
        double amount = sc.nextDouble();
        System.out.print("Please enter the dovriyye: ");
        String hansi = sc.next();

        boolean isValid = true;
        while (isValid) {
            if (amount < 0) {
                System.out.println("Money cant be negative!");
                System.out.print("Please enter valid amount: ");
                amount = sc.nextDouble();
            } else if (hansi.isEmpty() || hansi.isBlank()) {
                System.out.println("Cant be empty!");
                System.out.print("Please enter valid dovriyye: ");
                hansi = sc.next();
            } else {
                String hansi1 = hansi.toUpperCase();

                switch (hansi1) {
                    case "EUR" -> System.out.println("USD to EUR is: " + amount * 0.5);
                    case "JPY" -> System.out.println("USD to JPY is: " + amount * 1.9);
                    case "GBP" -> System.out.println("USD to GBP is: " + amount * 0.9);
                    default -> {
                        System.out.println("Invalid dovriyye!");
                        System.out.print("Please enter valid dovriyye: ");
                        hansi = sc.next();
                        continue;
                    }
                }
                isValid = false;
            }

        }

    }
}
