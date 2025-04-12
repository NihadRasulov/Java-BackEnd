package Months.Month3.Lesson17;

import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {

        Shape circle = new Circle("Circle color", 2.5);
//        circle.printDetails();
        Shape rectangle = new Rectangle("Rectangle color", 2.4, 3.6);
//        rectangle.printDetails();
        Shape triangle = new Triangle("Triangle color", 1.2, 2.4, 3.4);
//        triangle.printDetails();

        List<Shape> list = new ArrayList<>();
        list.add(circle);
        list.add(rectangle);
        list.add(triangle);

        for (Shape shape : list) {
            shape.printDetails();
        }
    }
}
