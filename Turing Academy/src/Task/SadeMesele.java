package Task;

import java.util.Scanner;

public class SadeMesele {

    public static void main(String[] args) {

            Scanner number = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int a = number.nextInt();

            if (a >= 10 && a <= 99) {
                int b = a / 10;
                int c = a % 10;
                System.out.println("The number is:" + a);
                System.out.println("The number space between digits:" + b + "  " + c);
            } else {
                System.out.println("Your number is'nt between 10 and 99");
            }

    }
}