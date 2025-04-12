package Months.Month3.Lesson17;

public class Rectangle extends Shape {

    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        System.out.print("Rectangle perimeter is: ");
        return 2 * (width + height);
    }

}
