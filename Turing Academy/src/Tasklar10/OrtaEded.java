package Tasklar10;

import java.util.Scanner;

public class OrtaEded {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Please enter number 1: ");
        int a = number.nextInt();

        System.out.print("Please enter number 2: ");
        int b = number.nextInt();

        System.out.print("Please enter number 3: ");
        int c = number.nextInt();

        if (a < 1000 && b < 1000 && c < 1000) {

            if (a > b && a < c || a<b && a > c) {
                System.out.println("Meridian is: " + a);
            }
            else if (b > a && b < c || b>c && b < a) {
                System.out.println("Meridian is: " + b);
            }
            else if (c > a && c < b || c>b && c <a) {
                System.out.println("Meridian is: " + c);
            }
        }
            else {
                System.out.println("Your number is above 1000");
            }
        }
    }
