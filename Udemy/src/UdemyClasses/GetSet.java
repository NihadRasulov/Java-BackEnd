package UdemyClasses;

public class GetSet {

    public static void main(String[] args) {

        GetterAndSetter next = new GetterAndSetter();
        next.setAge(18);
        next.setGender('K');
        next.setName("Nihad");
        System.out.println("Age is: " + next.getAge());
    }
}

class GetterAndSetter {
    String name;
    int age;
    char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}