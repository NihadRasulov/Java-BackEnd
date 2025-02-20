package Task2;

import java.util.Scanner;

public class Tapsiriq2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of week day: ");

        while (true) {
            int n = sc.nextInt();
            if (n < 0 || n > 7) {
                System.out.println("You input incorrect day");
                System.out.print("Please enter valid day: ");
                continue;
            } else {
                switch (n) {
                    case 1 -> System.out.println("Monday");
                    case 2 -> System.out.println("Tuesday");
                    case 3 -> System.out.println("Wednesday");
                    case 4 -> System.out.println("Thursday");
                    case 5 -> System.out.println("Friday");
                    case 6 -> System.out.println("Saturday");
                    case 7 -> System.out.println("Sunday");
                }
            }
            break;
        }
    }
}
