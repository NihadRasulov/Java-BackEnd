package Class;

import java.util.Scanner;

public class New1 {

    public static void main(String[] args) {

        Scanner string = new Scanner(System.in);
        System.out.print("Please enter a Car name: ");
        String carName = string.nextLine();

        New2 nihad = new New2();
        nihad.name = "Nihad";
        nihad.age = 20;
        nihad.gender= 'K';
        System.out.println(nihad.name);
        System.out.println(nihad.age);
        System.out.println(nihad.gender);
    }
}
