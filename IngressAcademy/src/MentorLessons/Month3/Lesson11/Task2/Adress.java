package MentorLessons.Month3.Lesson11.Task2;

public class Adress {

    private String country;
     private String city;

    public Adress(String country,String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
