package University.src.Abstraction;

public class MainClass {

    public static void main(String[] args) {
        GeoFiqur g1 = new Triangle("Triangle",3,4,5);
        g1.melumatlariGoster();
        GeoFiqur g2 = new Circle("Circle",5);
        g2.melumatlariGoster();
    }
}
