package Task;

import java.util.Scanner;

public class KvadratlarCemi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Please enter number 2: ");
        int b = sc.nextInt();
        int c=a*a + b*b;
        System.out.println("Kvadratlari Cemi: " + c);
    }
}
