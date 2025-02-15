package Lessons.Lesson4;

import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args) {

//        System.out.print("Please chose coffee: ");
//        String coffee = sc.next();
//        int point = 0;
//        switch (coffee) {
//            case "Exp":
//                point += 5;
//                break;
//            case "Mocha":
//                point += 3;
//                break;
//            case "Cappuccino","Latte","Hot Chocolate":
//                point += 2;
//                break;
//            default:
//                point += 1;
//        }
//        System.out.println("Your point is: " + point);
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your score: ");
        while (true) {
            int score = sc.nextInt() ;
            if (score > 100 || score < 0) {
                System.out.print("Invalid score! Please enter a score between 0 and 100: ");
                continue;
            }
            else {
                int newScore = score/10;
            switch (newScore) {
                case 10, 9 -> System.out.println("A");
                case 8 -> System.out.println("B");
                case 7 -> System.out.println("C");
                case 6 -> System.out.println("D");
                case 5,4, 3, 2, 1, 0 -> System.out.println("F, You failed!");
            }
            }
            break;
        }
    }
}
