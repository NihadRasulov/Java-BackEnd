package Tasks.Task1;

import java.util.Scanner;

public class Tapsiriq2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a = sc.nextInt();
        System.out.print("Please enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("First number " + a + " is greater than second number " + b);
        } else if (a == b) {
            System.out.println("First number " + a + " is equal to second number " + b);
        } else {
            System.out.println("Second number " + b + " is greater than first number " + a);
        }
    }
}
