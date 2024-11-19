package Tasklar10;

import java.util.Scanner;

public class AylarVeRubler {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month = number.nextInt();

        if (month==1 || month==2 || month==3) {
            System.out.println("Turing.First");
        }
        else if(month==4 || month==5 || month==6){
            System.out.println("Second");
        }
        else if(month==7 || month==8 || month==9){
            System.out.println("Third");
        }
        else if(month==10 || month==11 || month==12){
            System.out.println("Fourth");
        }
        else{
            System.out.println("Turing.Month number isn't correct");
        }
    }
}
