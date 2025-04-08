package MentorLessons.Lesson9.Task;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(String color,double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
