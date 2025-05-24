package MentorLessons.Month3.Lesson10;

public class Parent extends Abstraction {

    String name = "Parent";

//    public Parent(String name,String nameParent) {
//        super(name);
//        this.nameParent = nameParent;
//    }

    @Override
    public void print() {
        System.out.println("Parent Class");
    }

    public static void main(String[] args) {

        Abstraction abstraction = new Parent();
        abstraction.print();
        System.out.println(abstraction.name);
        System.out.println(abstraction.eatFood());
        Abstraction abstraction1 = new Abstraction() {
            @Override
            public void print() {
                System.out.println("Abstract method");
            }
        };
        System.out.println(abstraction1.name);

        Parent parent = new Parent();
        System.out.println(parent.name);

    }
}
