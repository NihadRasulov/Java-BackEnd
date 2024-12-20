package Inheritange;

public class RunClass {

    public static void main(String[] args) {

        Box box1 = new Box(12,12);
        box1.getboxmodel();

        BigBox box2 = new BigBox(12,13,14);
        box2.getboxmodel();
        box2.getArea();

        SmallBox box3 = new SmallBox(13,14);
        box3.getboxmodel();
        box3.getArea();
    
    }
}
