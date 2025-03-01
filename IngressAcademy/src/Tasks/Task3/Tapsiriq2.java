package Tasks.Task3;

import java.util.Scanner;

public class Tapsiriq2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tam ədədi daxil edin: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci ədədləri: " + a);
        while (b <= n) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
        }

    }
}
