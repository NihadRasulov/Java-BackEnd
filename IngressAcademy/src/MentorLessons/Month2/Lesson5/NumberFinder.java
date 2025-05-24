package MentorLessons.Month2.Lesson5;

import java.util.Random;
import java.util.Scanner;

public class NumberFinder {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(101);
        System.out.println("Please enter a number between 1 and 100: ");
        Scanner sc = new Scanner(System.in);
        int num;
        while(true) {
            num = sc.nextInt();
            if (num < 0 || num > 100) {
                System.out.println("Please enter a number between 1 and 100: ");
            }
            else if (num == number) {
                System.out.println("You find the number!");
                break;
            }
            else if (num>number) {
                System.out.println("Please enter a smaller number: ");
            }
            else {
                System.out.println("Please enter a larger number: ");
            }
        }
        System.out.println("The number is " + number);
    }
}
