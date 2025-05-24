package MentorLessons.Month3.Lesson12.Task1;

import java.time.LocalDate;

public class Book {
    private String name;
    private int icareGunleri;
    private LocalDate creationDate;

    public Book(String name, int icareGunleri, LocalDate creationDate) {
        this.name = name;
        this.icareGunleri = icareGunleri;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcareGunleri() {
        return icareGunleri;
    }

    public void setIcareGunleri(int icareGunleri) {
        this.icareGunleri = icareGunleri;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void borc(int date){
        if (date>icareGunleri){
            int borcluGunSayi = date-icareGunleri;
            System.out.println("Sizin borcunuz: " + borcluGunSayi*2);
        }
    }

}
