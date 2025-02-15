package MentorLessons.Lesson3;

public class Car {

    private String model;
    private double speed;
    private int year;

    public Car() {
    }

    public Car(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Car(String model, double speed, int year) {
        this.model = model;
        this.speed = speed;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public double increaseSpeed(double increaseSpeed) {
        return speed += increaseSpeed;
    }

    public double decreaseSpeed(double decreaseSpeed) {
        return speed -= decreaseSpeed;
    }

    public void getCarDetails() {
        System.out.println("Model: " + getModel() + " Year: " + getYear() + " Speed: " + getSpeed());
    }

//    public static void check() {
//        System.out.println("Car Details");
//    }


}
