package MentorLessons.Month3.Lesson10.MultipleInheritence;

public class A extends B {

    @Override
    public void print() {
        System.out.println("Class A");
    }

    @Override
    public String methodC() {
        return "Class A";
    }

    public void run() {
        System.out.println("Class A");
    }
}
