package Months.Month2.Lesson15;

public class Honda extends Car{

    private String model;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Honda(String brand, int year, int numDoors, boolean isElectric, String model, String color) {
        super(brand, year, numDoors, isElectric);
        this.model = model;
        this.color = color;
        System.out.println("Honda Constructor: Model set to Civic, Color set to Red.");
    }

    public static void accelerate() {
        System.out.println("Honda is accelerating.");
    }

    public static void brake() {
        System.out.println("Honda is braking.");
    }


}
