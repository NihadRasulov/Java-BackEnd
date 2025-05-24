package MentorLessons.Month3.Lesson10.Task;

public class Run {

    public static void main(String[] args) {

        Employee partTimeEmployee = new PartTimeEmployee("Part time Employee","1234",200,9);
        System.out.println(partTimeEmployee.calculateSalary());

        Employee fullTimeEmployee = new FullTimeEmployee("Full time Employee","4321",1500,1000);
        System.out.println(fullTimeEmployee.calculateSalary());

    }
}
