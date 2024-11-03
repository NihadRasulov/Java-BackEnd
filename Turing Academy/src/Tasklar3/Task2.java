package Tasklar3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = number.nextInt();

//            if(a==12 || a==1 || a==2){
//                System.out.println("The season is Winter");
//            }
//            else if(a==3 || a==4 || a==5){
//                System.out.println("The season is Spring");
//            }
//            else if(a==6 || a==7 || a==8){
//                System.out.println("The season is Summer");
//            }
//            else if(a==9 || a==10 || a==11){
//                System.out.println("The season is Autumn");
//            }
//            else{
//                System.out.println("The month is incorrect");
//            }


        switch (a) {
            case 1:
                System.out.println(" Month of January and Season of Winter");
                break;
            case 2:
                System.out.println("Month February and Season of Winter");
                break;
            case 3:
                System.out.println("Month of March and Season of Spring");
                break;
            case 4:
                System.out.println("Month of April and Season of Spring");
                break;
            case 5:
                System.out.println("Month of May and Season of Spring");
                break;
            case 6:
                System.out.println("Month of June and Season of Summer");
                break;
            case 7:
                System.out.println("Month of July and Season of Summer");
                break;
            case 8:
                System.out.println("Month of August and Season of Summer");
                break;
            case 9:
                System.out.println("Month of September and Season of Autumn");
                break;
            case 10:
                System.out.println("Month of October and Season of Autumn");
                break;
            case 11:
                System.out.println("Month of November and Season of Autumn");
                break;
            case 12:
                System.out.println("Month of December and Season of Winter");
                 break;
            default:
                System.out.println("Invalid input");
        }

    }
}
