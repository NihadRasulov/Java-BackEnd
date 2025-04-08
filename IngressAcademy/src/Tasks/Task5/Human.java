package Tasks.Task5;

public final class Human {
    private String name = "Unknown";
    private int age;
    private double height;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this(name);
        this.age = age;
    }

    public Human(String name, int age, double height) {
        this(name, age);
        this.height = height;
    }

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {

        Human human1 = new Human("Nihad");
        human1.setAge(18);
        human1.setHeight(1.75);
        System.out.println(human1);
        System.out.println(human1.getAge());

        Human human2 = new Human("Rovshan",21);
        human2.setHeight(1.74);
        System.out.println(human2);


    }
}
