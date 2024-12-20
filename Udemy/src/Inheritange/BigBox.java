package Inheritange;

public class BigBox extends Box {

    private int lenght;
    private int width;
    private int height;

    public BigBox(int l, int w, int h) {
        super(l, w);
        this.lenght = l;
        this.width = w;
        this.height = h;
    }

    public void getboxmodel() {
        System.out.println("I am the Big Box");
    }
    public void getArea() {
        double area = lenght * width * height;
        System.out.println("Big Box area is " + area);
    }
}
