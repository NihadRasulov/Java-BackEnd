package Turing;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter the number of a: ");
        int a = number.nextInt();
        System.out.println("Please enter the number of b: ");
        int b = number.nextInt();

        int c = ++a;
        int d = ++b;

        System.out.println("The number of c: " + c);
        System.out.println("The number of d: " + d);

    }
}
