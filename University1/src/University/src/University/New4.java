package University.src.University;

import java.util.Scanner;
public class New4 {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = number.nextInt();
        if(a % 2 == 0)
            System.out.println("Even");
        else System.out.println("Odd");
    }
}
