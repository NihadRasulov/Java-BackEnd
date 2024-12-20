package University.src.EmployeeClassExample;

public class Teacher extends Employee {
    public String empType = "Teacher";
    private String fenn;
    private int saatliqgelir;
    private int time;

    public Teacher(String name,String fenn, int saatliqgelir, int time) {
        super(name);
        this.fenn = fenn;
        this.saatliqgelir = saatliqgelir;
        this.time = time;
    }
    @Override
    public int getSalary() {
        return saatliqgelir * time;
    }

    @Override
    public void showInfo() {
        System.out.println("Employee Name: " + getName() + ", Profession: " + empType + ", Subject: " + fenn + ", Salary: " + getSalary()+ " manat");
    }
}
