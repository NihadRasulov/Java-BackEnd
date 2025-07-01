package BackendGroup;

import java.util.Scanner;

public class Tapsiriq2 {
    
    public static void main(String[] args) {

        System.out.print("Please enter a positive number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean check = true;
        while (check) {
            if (num > 0){
                System.out.println("You entered the positive number!");
                if (num < 10){
                    System.out.println("The number is " + num);
                }else {
                    int sum = 0;
                    while(num%10!=0){
                        sum+=num%10;
                        num = num/10;
                    }
                    System.out.println("The number's index sum is " + sum);
                }
                check = false;
            } else if (num == 0) {
                System.out.println("You entered 0!");
                System.out.print("Please try again: ");
                num = sc.nextInt();
            }
            else {
                System.out.println("You entered a negative number!");
                System.out.print("Please try again: ");
                num = sc.nextInt();
            }
        }
    }
}
