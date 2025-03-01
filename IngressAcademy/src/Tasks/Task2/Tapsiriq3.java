package Tasks.Task2;

import java.util.Scanner;

public class Tapsiriq3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the light of trafic light: ");
        String light = sc.next();
        String newlight = light.toUpperCase();
//        System.out.println(newlight);
//        if (newlight.isEmpty()) {
//            System.out.println("You don't have any light");
//        }
//        else if (newlight.equals("RED") || newlight.equals("QIRMIZI")) {
//            System.out.println("Stop");
//        }
//        else if (newlight.equals("YELLOW") || newlight.equals("SARI")) {
//            System.out.println("Ready");
//        }
//        else if (newlight.equals("GREEN") || newlight.equals("YASIL")) {
//            System.out.println("Go");
//        }
//        else {
//            System.out.println("Wrong light");
//        }

        switch (newlight) {
            case "RED","QIRMIZI"-> System.out.println("Stop");
            case "YELLOW","SARI"-> System.out.println("Ready");
            case "GREEN","YASIL"-> System.out.println("Go");
            default -> System.out.println("Wrong light");
        }

    }
}
