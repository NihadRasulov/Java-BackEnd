package University.src.Inheritange;

public class Dog extends Animal {
     String name;
     int age;
     String voice;

    @Override
    public void speak() {
        System.out.println("Dog speak Huv-Hiv");
    }

    public Dog(String name, int age, String voice) {
         super(name,age,voice);
         this.name = name;
         this.age = age;
         this.voice = voice;
     }

    public static void main(String[] args) {
        Dog dog = new Dog("Name",13,"Hav-Hiv");

        dog.speak();
        System.out.println();
        dog.melumatlarigoster();
    }
}
