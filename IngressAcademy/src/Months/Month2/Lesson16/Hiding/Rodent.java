package Months.Month2.Lesson16.Hiding;

public class Rodent {

    protected int tailLength = 4;
    public void getRodentDetails() {
        System.out.println("[parentTail="+tailLength+"]");
    }
}
class Mouse extends Rodent {
    protected int tailLength = 8;
    public void getMouseDetails() {
        System.out.println("[tail="+tailLength +",parentTail="+tailLength+"]");
    }
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
    }
}