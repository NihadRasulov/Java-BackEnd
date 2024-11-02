package Task;

import java.util.Scanner;

public class KenardakilarinCemi {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Please enter four digit number: ");
        int a = number.nextInt();

        if(a>=1000 && a<=9999){
            int b=a/1000;
            int c=a%10;
            int d=b+c;
            System.out.println("The number's first digit is "+b);
            System.out.println("The number's fourth digit is "+c);
            System.out.println("The sum of first ant fourth digit is: " + d);
        }
        else {
            System.out.println("Invalid number");
        }
    }
}
