package Tasks.Task3;

import java.util.Scanner;

public class Tapsiriq4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = scanner.nextInt();

        int maxDigit = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number =number / 10;
        }

        System.out.println("The max number of number: " + maxDigit);
    }
}
