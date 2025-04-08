package Months.Month2.Lesson15;

public class Vehicle {

    private String brand;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle Constructor: Brand set to Honda, Year set to 2020.");
    }
    public static void start(){
        System.out.println("Vehicle is starting.");
    }

    public static void stop() {
        System.out.println("Vehicle is stopping.");
    }


}
