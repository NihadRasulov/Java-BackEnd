package MentorLessons.Lesson8;

public class Car {

    String brand;
    String model;
    int year;

    public Car(){}
    public Car(String brand) {
        this.brand = brand;
    }
    public Car(String brand, String model) {
        this(brand);
        this.model = model;
    }
    public Car(String brand,String model,int year) {
        this(brand,model);
        this.year = year;
    }


    public static void main(String[] args) {

        Car car1 = new Car("Brend");
        Car car2 = new Car("Brend","BMW");
        Car car3 = new Car("Brend","AUDI",2020);

    }
}
