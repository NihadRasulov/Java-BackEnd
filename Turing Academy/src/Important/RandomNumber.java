package Important;

import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int randomNumber = (int) (Math.random() * 100);
        if (number == randomNumber) {
            System.out.println("You win 10000AZN!");
        }
        int a = number/10;
        int b = number%10;
        int c = randomNumber/10;
        int d = randomNumber%10;

        if(a==d && b==c){
            System.out.println("You win 5000AZN!");
        }
        else if(a==c || b==d || a==d || b==c){
            System.out.println("You win 1000AZN!");
        }
        else{
            System.out.println("You lose!");
        }
        System.out.println("The random number is: " + randomNumber);
    }
}
