package UdemyClasses;

class Vehicle{
    String color;
    int speed;
    String model;

    public Vehicle(String color, int speed, String model){
        this.color = color;
        this.speed = speed;
        this.model = model;
    }

    public void start(){
        System.out.println("Starting Vehicle");
    }
    public void output(){
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Model: " + model);
    }
}

public class ConstructorwithParametr {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("red", 20, "model");
        vehicle1.start();
        vehicle1.output();
    }
}
