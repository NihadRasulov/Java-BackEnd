package Important;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int b=0;
        while(num!=0) {
            int digit = num%10;
            b=b*10+digit;
            num=num/10;
        }
        System.out.println("Important.Reverse number: " + b);
    }
}
