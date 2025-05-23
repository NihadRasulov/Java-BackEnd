package Sections.Section7.Slide100;

public class Circle {
    private double radius;
    public Circle(double radius) {
        if (radius<0) {
            radius = 0;
        }
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return (radius*radius*Math.PI);
    }
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, -1);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

    }
}
