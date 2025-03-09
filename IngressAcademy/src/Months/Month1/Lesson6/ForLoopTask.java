package Months.Month1.Lesson6;

import java.util.Scanner;

public class ForLoopTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + n + " = " + i * n);
        }
//        int factor = 1;
//        for (int i = n; i>0; i--) {
//            factor = factor * i;
//        }
//        System.out.println(n + " Factorial is: " + factor);
    }
}
