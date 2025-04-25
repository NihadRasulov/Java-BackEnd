package MentorLessons.Lesson10.MultipleInheritence;

public class Run {

    public static void main(String[] args) {

        B a = new A();
        a.run();
        a.print();
        System.out.println(a.methodC());

        C a1 = new A();
        a1.run();
        a1.print();
        System.out.println(a1.methodC());


    }
}
