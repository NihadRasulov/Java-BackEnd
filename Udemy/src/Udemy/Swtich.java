package Udemy;

import java.util.Scanner;

public class Swtich {

    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        String grade = string.next();
        switch (grade) {
            case "A","A+","A-":
                System.out.println("You are great student");
                break;
            case "B","B+","B-":
                System.out.println("You are good student");
                break;
            case "C","C+","C-":
                System.out.println("You are poor student");
                break;
            case "D","D+","D-":
                System.out.println("You are very poor student");
                break;
            default:
                System.out.println("You are failed");

        }
    }
}
