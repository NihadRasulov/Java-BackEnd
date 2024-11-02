package Task;

import java.util.Scanner;

public class BirinciyoxsaAxirinci {

    public static void main(String[] args) {

    Scanner number = new Scanner(System.in);
    System.out.print("Please enter a 3 digit number: ");
    int a = number.nextInt();

    if(a>=100 && a<=999) {
        int b = a / 100;
        int c = a % 10;
        int d = (a / 10)%10;

        if(b > c && b > d) {
            System.out.println("The large digit is first digit: " + b);
        }
        else if(d>b && c < d) {
            System.out.println("The large digit is second digit: " + d);
        }
        else if(b < c && d < c) {
            System.out.println("The large digit is third digit: " + c);
        }
        else {
            System.out.println("The number digit is equal.");
        }
    }
    else {
        System.out.println("The number is'nt 3 digit number");
    }
        System.out.println("the number is: " + a);
    }
}
