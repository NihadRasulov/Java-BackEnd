package Months.Month3.Lesson17;

public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calculatePerimeter() {
        System.out.print("Circle perimeter is: ");
        return 2 * Math.PI * radius;
    }


}
