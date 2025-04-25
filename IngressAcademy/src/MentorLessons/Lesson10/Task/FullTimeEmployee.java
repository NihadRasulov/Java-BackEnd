package MentorLessons.Lesson10.Task;

public class FullTimeEmployee extends Employee {

    double bonus;

    public FullTimeEmployee(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }


    @Override
    public double calculateSalary() {
        System.out.print("Full time employee salary is: ");
        return salary + bonus;
    }
}
