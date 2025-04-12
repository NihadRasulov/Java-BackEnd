package Months.Month3.Lesson17;

public abstract class Shape {

    String color;

    public Shape(String color) {
        this.color = color;
    }

    public void printDetails() {
        System.out.println("Color: " + this.color);

        System.out.println(calculatePerimeter());
        System.out.println();
    }

    public abstract double calculatePerimeter();


}
