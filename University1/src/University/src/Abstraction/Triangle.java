package University.src.Abstraction;

import java.awt.*;

public class Triangle extends GeoFiqur {

    private int a, b, c;

    public Triangle(String ad, int a, int b, int c) {
        super(ad);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double saheHesabla() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double perimetr() {
        return a+b+c;
    }

    @Override
    public void melumatlariGoster() {
        System.out.println("Fiqurun Adi: " + getAd() + ", Fiqurun sahesi: " + saheHesabla() + "Fiqurun perimetri: " + perimetr());
    }
}
