package MentorLessons.Month1.Lesson3;

public class Lesson3 {

    public static void main(String[] args) {

        Car car = new Car("BMW",90, 2025);
        car.getCarDetails();
        car.increaseSpeed(150);
        car.getCarDetails();
        car.decreaseSpeed(50);
        car.getCarDetails();

        //

//        Car.check();
    }
}
