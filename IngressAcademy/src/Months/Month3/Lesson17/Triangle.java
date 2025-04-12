package Months.Month3.Lesson17;

public class Triangle extends Shape {

    double sideA;
    double sideB;
    double sideC;

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculatePerimeter() {
        System.out.print("Triangle perimeter is: ");
        return sideA + sideB + sideC;
    }

}
