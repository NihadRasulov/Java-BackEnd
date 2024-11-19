package Tasklar10;

import java.util.Scanner;

public class DuzbucaqliUcbucaq {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Please enter Triangle side 1: ");
        int side1 = number.nextInt();
        System.out.print("Please enter Triangle side 2: ");
        int side2 = number.nextInt();
        System.out.print("Please enter Triangle side 3: ");
        int side3 = number.nextInt();

        if(side1>=1000 || side2>=1000 || side3>=1000){
            System.out.println("The Triangle sides too big!");
        }
                while(side1<1000  && side2<1000  && side3<1000) {
                    int a = side1 * side1;
                    int b = side2 * side2;
                    int c = side3 * side3;
                    if (a + b == c || a + c == b || b + c == a) {
                        System.out.println("The Triangle is a Turing.Duzbucaqli Triangle");
                    }
                    else {
                        System.out.println("The Triangle isn't a Turing.Duzbucaqli Triangle");
                    }
                    break;
                }

    }
}
