package MentorLessons.Lesson9.Task;

import java.util.ArrayList;
import java.util.List;

public class TestShape {

    public static void main(String[] args) {

        Shape shape1 = new Circle("Color1", 2.5);
        Shape shape2 = new Rectangle("Color2", 4.5, 5.5);

        List<Shape> list = new ArrayList<>();

        list.add(shape1);
        list.add(shape2);
        for (Shape shape : list) {
            test(shape);
        }
    }

    public static void test(Shape shape) {
        System.out.println(shape.getColor());
    }
}
