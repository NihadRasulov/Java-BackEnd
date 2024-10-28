import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter the numbers: ");
        int a = number.nextInt();
        int b = number.nextInt();

        int c = ++a;
        int d = ++b;

        System.out.println("The number of c: " + c);
        System.out.println("The number of d: " + d);

    }
}
