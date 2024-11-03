package Tasklar3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = number.nextInt();

//        if(a%2==0 && a<0 && a!=0){
//            System.out.println("The number is negative");
//            System.out.println("The number is even");
//            System.out.println("The number is: " + a);
//        }
//        else if(a%2==0 && a>0 && a!=0){
//            System.out.println("The number is positive");
//            System.out.println("The number is even");
//            System.out.println("The number is: " + a);
//        }
//        else if (a%2!=0 && a<0 && a!=0) {
//            System.out.println("The number is negative");
//            System.out.println("The number is odd");
//            System.out.println("The number is: " + a);
//        }
//        else if (a%2!=0 && a>0 && a!=0) {
//            System.out.println("The number is positive");
//            System.out.println("The number is odd");
//            System.out.println("The number is: " + a);
//        }
//        else if(a==0){
//            System.out.println("The number is zero");
//        }

        String result = a > 0 ? "Positive" : (a == 0 ? "Zero" : "Negative");
        System.out.println(result);

    }

}

