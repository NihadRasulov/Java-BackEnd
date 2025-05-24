package MentorLessons.Month3.Lesson9.Task;

public class Circle extends Shape{


    private double radius;

    public Circle (String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

}
