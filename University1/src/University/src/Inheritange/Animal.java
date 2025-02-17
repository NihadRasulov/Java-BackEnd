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
//        System.out.println("The animal melumat");
        System.out.println("The animal name: " + name + "\nThe animal age: " + age + "\nThe animal voice: " + voice);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Name",13,"Hav-Hiv");

        dog.speak();
//        System.out.println();
        dog.melumatlarigoster();

        Animal animal = new Animal("Animal",12,"sound");
        animal.speak();
        animal.melumatlarigoster();
    }
}
