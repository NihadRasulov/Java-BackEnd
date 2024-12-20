package University.src.Abstraction;

import java.awt.*;

public class Circle extends GeoFiqur {
    private int radius;

    public Circle(String ad, int radius) {
        super(ad);
        this.radius = radius;
    }

    @Override
    public double saheHesabla() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void melumatlariGoster() {
        System.out.println("Fiqurun Adi: " + getAd() + ", Fiqurun Sahesi: " + saheHesabla() + ", Fiqurun Perimetr: " + perimetr());
    }
}
