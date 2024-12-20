package University.src.Abstraction;

public abstract class GeoFiqur {
    private String ad;

    public GeoFiqur(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    public abstract double saheHesabla();
    public abstract double perimetr();
    public void melumatlariGoster() {
        System.out.println("Ad: " + ad);
    }
}
