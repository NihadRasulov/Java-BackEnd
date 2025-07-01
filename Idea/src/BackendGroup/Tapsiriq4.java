package BackendGroup;

import java.util.Scanner;

public class Tapsiriq4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.next();
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Please enter your height: ");
        double height = scanner.nextDouble();

        System.out.println("Salam, " + name + "(Mənim yasim " + age + ", mənim boyum " + height + ")");
    }
}
