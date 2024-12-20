package University.src.EmployeeClassExample;

public class Employee {
    private String name;
    private int age;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return 0;
    }
    public void showInfo() {
        System.out.println("Employee Name: " + name + "Employee Salary: " + getSalary() + " manat");
    }
}
