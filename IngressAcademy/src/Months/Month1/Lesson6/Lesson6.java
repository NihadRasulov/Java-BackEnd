package Months.Month1.Lesson6;


import java.util.Scanner;

public class Lesson6 {

    public static void main(String[] args) {
        Lesson6 obj = new Lesson6();
        obj.checkPinNumber(123);


    }
    public void checkPinNumber(int pin) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Pin: ");
        while (true) {
            int number = sc.nextInt();
            if (number != pin) {
                System.out.println("You input incorrect Pin");
                System.out.print("Please enter Pin: ");
                continue;
            } else {
                System.out.println("You entered the correct Pin");
            }
            break;
        }
    }
}
