package University.src.Important;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int num1 = sc.nextInt();


        while (true) {
            System.out.print("Enter the denominator: ");
            int num2 = sc.nextInt();
            try {
                if (num2 == 0) {
                    throw new ArithmeticException("You can't divide by zero");
                }
                double result = num1 / num2;
                System.out.println("The result is: " + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
