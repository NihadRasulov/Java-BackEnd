package MentorLessons.Lesson10.Task;

public class PartTimeEmployee extends Employee {

    int time;

    public PartTimeEmployee(String name, String id, double salary,int time) {
        super(name, id, salary);
        this.time = time;
    }


    @Override
    public double calculateSalary() {
        System.out.print("Part time employee salary is: ");
        return time * salary;
    }
}
