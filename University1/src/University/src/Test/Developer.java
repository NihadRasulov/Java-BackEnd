package University.src.Test;

import University.src.EmployeeClassExample.Employee;

public class Developer extends Employee {
    private String profession;
    private int salary;
    public Developer( String employerName, String profession, int salary) {
        super(employerName);
        this.profession = profession;
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printEmployers() {
        System.out.println("Employee name: " + getName() + "\nEmployee profession " + getProfession() + "\nEmployee salary: " + getSalary());
    }
    public void getBonus() {
        System.out.println("After one year experience you have 1000AZN bonus");
    }

}
