package Inheritange;

public class SmallBox extends Box {

    private int lenght;
    private int width;

    public SmallBox(int l, int w) {
        super(l, w);
        this.lenght = l;
        this.width = w;
    }

    public void getboxmodel() {
        System.out.println("I am the Small Box");
    }
    public void getArea() {
        double area = lenght * width;
        System.out.println("Small Box area is " + area);
    }
}
