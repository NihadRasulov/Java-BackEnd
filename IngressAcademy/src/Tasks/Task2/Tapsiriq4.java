package Tasks.Task2;

public class Tapsiriq4 {

    String name;
    int age;

    public  void printInfo() {
        System.out.println("Student name is: " + name + "\nStudent age is: " + age);
    }

    public static void main(String[] args) {

        Tapsiriq4 student1 = new Tapsiriq4();
        Tapsiriq4 student2 = new Tapsiriq4();
        Tapsiriq4 student3 = new Tapsiriq4();
        student1.name = "Nihad";
        student1.age = 18;
        student2.name = "Murad";
        student2.age = 17;
        student3.name = "Ali";
        student3.age = 15;

        if (student1.age > student2.age && student1.age > student3.age) {
            student1.printInfo();
        }
        else if (student2.age > student3.age && student2.age > student1.age) {
            student2.printInfo();
        }
        else {
            student3.printInfo();
        }
    }
}
