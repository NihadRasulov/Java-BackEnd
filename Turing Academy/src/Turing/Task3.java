package Turing;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter the number of a: ");
        int a = number.nextInt();
        System.out.println("Please enter the number of b: ");
        int b = number.nextInt();

        a+=5;
        b+=2;

        System.out.println("The number of c: " + a);
        System.out.println("The number of d: " + b);

    }
}
