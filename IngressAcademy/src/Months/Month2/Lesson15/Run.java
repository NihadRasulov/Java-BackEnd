package Months.Month2.Lesson15;

public class Run {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Vehicle",2020);
        vehicle.start();
        Car car = new Car("Honda",2022,4,true);
        car.drive();


        Honda honda = new Honda("Honda",2023,2,false,"Civic","Blue");
        honda.accelerate();
//        Vehicle vehicle1 = new Car("BMW",2025,2,false);
//        ((Car) vehicle1).park();
//        Vehicle vehicle2 = new Honda("Toyota",2023,4,false,"Corolla","White");
//        ((Honda) vehicle2).park();



    }
}
