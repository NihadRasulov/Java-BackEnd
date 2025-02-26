package Task3;

import java.util.Scanner;

public class Tapsiriq1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <=num; i++) {
            i = num%10;
            num = num/10;
            sum += i;
        }
        System.out.println("The number's number sum is: " + sum);
    }
}
