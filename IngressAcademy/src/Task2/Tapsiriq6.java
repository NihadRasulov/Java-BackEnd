package Task2;

import java.util.Scanner;

public class Tapsiriq6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum from 1 to number is: " + sum);

    }
}
