package Tasklar10;

import java.util.Scanner;

public class IlinFeslleri {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = number.nextInt();

        if(a==1 || a==2 || a==12){
            System.out.println("Winter");
        }
        else if (a==3 || a==4 || a==5){
            System.out.println("Spring");
        }
        else if (a==6 || a==7 || a==8){
            System.out.println("Summer");
        }
        else if (a==9 || a==10 || a==11){
            System.out.println("Autumn");
        }
        else{
            System.out.println("Invalid Input!");
        }
    }
}
