package Inheritange;

public class Box {
    private int lenght;
    private int width;

    public Box(int l, int w) {
        this.lenght = l;
        this.width = w;
    }

    public void getboxmodel() {
        System.out.println("I am the parent Box");
    }

    public void getArea() {

        double area = lenght * width;
        System.out.println("Parent Box area is " + area);

    }
}
