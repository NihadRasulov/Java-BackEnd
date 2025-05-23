package MentorLessons.Month3.Lesson11.Task2;

public class User {

    private String name;
    private String surname;
    private int age;
    private Adress adress;

    public User(String name, String surname, int age, Adress adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", adress=" + adress +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }
}
