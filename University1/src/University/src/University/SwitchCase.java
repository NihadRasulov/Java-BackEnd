package University.src.University;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
                Scanner number = new Scanner(System.in);
                System.out.print("Please enter the number 1: ");
                int a = number.nextInt();

                System.out.print("Please enter the operation: ");
                char op = number.next().charAt(0);

                System.out.print("Please enter the number 2: ");
                int b = number.nextInt();

                switch(op){
                    case '+':
                        System.out.println("The sum of number 1 and number 2 is: " + (a+b));
                        break;
                    case '-':
                        System.out.println("The difference of number 1 and number 2 is: " + (a-b));
                        break;
                    case '*':
                        System.out.println("The product of number 1 and number 2 is: " + (a*b));
                        break;
                    case '/':
                        System.out.println("The quotient of number 1 and number 2 is: " + (a/b));
                        break;
                    default:
                        System.out.println("Invalid operation");
                }
    }
}
