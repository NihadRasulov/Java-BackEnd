package UdemyClasses;

import java.util.Scanner;

public class CONSTANT {

    public static String name;
    public static final double PI = 3.14;

}

class ConstantVariable{

    public static void main(String[] args) {

        Scanner ad = new Scanner(System.in);
        System.out.print("Please enter the name of the constant: ");
        String nam = ad.next();
        CONSTANT.name = nam;
        System.out.println(CONSTANT.name);
        System.out.println(CONSTANT.PI);
    }
}