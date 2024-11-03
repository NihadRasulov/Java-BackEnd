package Task;

import java.util.Scanner;

public class KvadratKok {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Please enter a three digit number: ");
        int a = number.nextInt();

        if(a>=100 && a<=999) {
            int c = a%10;
            int d = a/100;
            int e = (a/10) % 10;
            int f = c+d+e;
            int b = (int) Math.sqrt(f);
            System.out.println("The number is: " + a);
            System.out.println("The number digit 1 is: " + d);
            System.out.println("The number digit 2 is: " + e);
            System.out.println("The number digit 3 is: " + c);
            System.out.println("The number digits sum is: " + f);
            System.out.println("The number's digits sum kvadrat kok is: " + b);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
