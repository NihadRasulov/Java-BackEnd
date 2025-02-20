package Task1;

import java.util.Scanner;

public class Tapsiriq4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter your age: ");
            int age = sc.nextInt();
            if (age <0 || age == 0) {
                System.out.println("Age must be greater than 0");
                continue;
            }
            if (age <= 12) {
                System.out.println("Usaq");
            } else if (age <= 17) {
                System.out.println("Yeniyetmə");
            } else if (age <= 64) {
                System.out.println("Yetkin");
            }
            else {
                System.out.println("Yaşlı 65 və yuxarı");
            }
            break;
        }
    }
}
