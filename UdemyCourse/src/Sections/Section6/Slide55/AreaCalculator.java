package Sections.Section6.Slide55;

public class AreaCalculator {


    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(4,5));
    }
    public static double area(double radius){
        if (radius<0) {
            return -1;
        }
        else {
            double pi = Math.PI;
            double area1 = pi*radius*radius;
            return area1;
        }

    }
    public static double area (double x, double y) {
        if (x<0 || y<0) {
            return -1;
        }
        else {
            double area2 = x*y;
            return area2;
        }
    }
}
