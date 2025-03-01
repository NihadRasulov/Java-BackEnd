package Tasks.Task2;

import java.util.Scanner;

public class Tapsiriq1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();

        String result = num>0 ? "Number is positive" : num<0 ? "Number is negative" : "Number is zero";
        System.out.println(result);
    }
}
