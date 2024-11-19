package UdemyClasses;

class Student {

    public void name(String name1){
        System.out.println("My name is "+name1);
    }
}


public class InstanceMethod {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name("Nihad");

    }
}
