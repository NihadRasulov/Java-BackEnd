package Udemy;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = number.nextInt();
        System.out.println(a == 0 ? "Number is Zero" : a > 0 ? "The number is positive" : "The number is negative");
    }
}
