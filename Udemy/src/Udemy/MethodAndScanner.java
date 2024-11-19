package Udemy;

import java.util.Scanner;

public class MethodAndScanner {

    public static String name(String ad){
        return "My name is: " + ad;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.next();

        System.out.println(name(name));
    }
}
