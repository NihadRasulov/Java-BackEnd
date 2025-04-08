package Months.Month2.Lesson15;

public class Car extends Vehicle{

    private int numDoors;
    private boolean isElectric;

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public Car(String brand, int year, int numDoors, boolean isElectric) {
        super(brand, year);
        this.numDoors = numDoors;
        this.isElectric = isElectric;
        System.out.println("Car Constructor: Doors set to 4, Electric set to true.");
    }

    public static void drive() {
        System.out.println("Car is driving.");
    }

    public static void park() {
        System.out.println("Car is parking.");
    }


}
