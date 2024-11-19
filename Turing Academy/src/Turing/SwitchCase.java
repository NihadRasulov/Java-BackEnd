package Turing;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner number= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= number.nextInt();
        String result;
        switch(a){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid input";
        }
        System.out.println(result);
    }
}
