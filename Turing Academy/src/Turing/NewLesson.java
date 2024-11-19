package Turing;

import java.util.Scanner;

public class NewLesson {

    public static void main(String[] args) {

    Scanner number = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = number.nextInt();

        if(num%3==0){
            System.out.println("Eded 3 e qaliqsiz bolunur.");
        }
        else if(num%3==1){
            System.out.println("Eded 3 e qaliqsiz bolunmur ve qaliq 1 dir.");
        }
        else{
            System.out.println("Eded 3 e qaliqsiz bolunmur ve qaliq 2 dir.");
        }
    }
}
