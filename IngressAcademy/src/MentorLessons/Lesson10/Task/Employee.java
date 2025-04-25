package MentorLessons.Lesson10.Task;

public abstract class Employee {

    String name;
    String id;
    double salary;

    public Employee(String name,String id,double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract double calculateSalary();

}
