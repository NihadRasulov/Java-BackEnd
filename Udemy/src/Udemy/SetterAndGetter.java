package Udemy;

import java.util.Scanner;

public class SetterAndGetter {

    public static void main(String[] args) {

    Automobile bmw = new Automobile();
    bmw.make = "Germany";
    bmw.model = "BMW";
    bmw.year = 1000;
        System.out.println("The car is made: " + bmw.make);
        System.out.println("The car model is: " + bmw.model);
        System.out.println("The car year is: " + bmw.year);
        bmw.make = "Turkish";
        bmw.setMake();
        bmw.setModel("Tofaş");
    }
}

class Automobile {
    String make;
    String model;
    int year;

    private String getMake() {
        return make;
    }
    private String getModel() {
        return model;
    }
    private int getYear() {
        return year;
    }
    public void setMake() {
        System.out.println("Make is: " + make);
    }
    public void setModel( String model ) {
        this.model = model;
        System.out.println("Model is: " + model);
    }

}
