package Task1;

import java.util.Scanner;

public class Tapsiriq1 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Please enter number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Number is zero");
        }
        else if (num >0) {
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is negative");
        }
    }
}
