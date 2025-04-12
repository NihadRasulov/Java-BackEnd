package Task;

import java.util.Scanner;

public class Is_Palindrome {

    public static void main(String[] args) {

        System.out.print("Please enter a number: ");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            String number = Integer.toString(num);
            StringBuilder number_ = new StringBuilder(number);
            StringBuilder reverse = number_.reverse();
            String reverseNumber = reverse.toString();
            if (number.equals(reverseNumber)) {
                System.out.println("This number is Palindrome");
            }
            else {
                System.out.println("Number is not Palindrome");
            }
        }
        else {
            System.out.println("You dont enter a number!");
        }


    }
}
