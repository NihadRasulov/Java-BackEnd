package MentorLessons.Lesson1;

import java.util.Scanner;

public class SimpleCalculatorApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a = sc.nextInt();
        System.out.print("Please enter operation: ");
        char op = sc.next().charAt(0);
        while(true) {
            System.out.print("Please enter second number: ");
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                continue;
            }
            else {

                if (op == '+') {
                    System.out.println(a + b);
                } else if (op == '-') {
                    System.out.println(a - b);
                } else if (op == '*') {
                    System.out.println(a * b);
                } else if (op == '/') {
                    System.out.println(a / b);
                } else {
                    System.out.println("Invalid operation");
                }
            }
            break;
        }
    }
}
