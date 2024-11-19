package University.src.Class;

import java.util.Scanner;

public class New1 {

    public static void main(String[] args) {

        Scanner string = new Scanner(System.in);
        System.out.print("Please enter a Car name: ");
        String Name = string.nextLine();

        New2 Car = new New2();
        Car.carName = Name;
        System.out.println("The car name is: " + Car.carName);

        New2 nihad = new New2();

        nihad.name = "Nihad";
        nihad.age = 20;
        nihad.gender= 'K';
        System.out.println("Telebe adi: " + nihad.name);
        System.out.println("Telebe yasi" + nihad.age);
        System.out.println("Telebe cinsi" + nihad.gender);
    }
}
