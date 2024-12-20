package University.src.Inheritange;

public class Animal {
     String name;
     int age;
     String voice;
    public Animal(String name, int age, String voice) {
        this.name = name;
        this.age = age;
        this.voice = voice;
    }
    public void speak() {
        System.out.println("The animal sound is change animal by animal");
    }
    public void melumatlarigoster() {
        System.out.println("The animal melumat");
        System.out.println("The animal name: " + name + "\nThe animal age: " + age + "\nThe animal voice: " + voice);
    }

}
