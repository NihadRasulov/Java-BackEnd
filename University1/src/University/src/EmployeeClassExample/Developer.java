package University.src.EmployeeClassExample;

public class Developer extends Employee {
    public String empName = "Developer";
    private String prgoramlanguage;
    private int normalSalary;
    private int bonusSalary;

    public Developer(String name,String empName,String prgoramlanguage,int normalSalary,int bonusSalary) {
        super(name);
        this.empName = empName;
        this.prgoramlanguage = prgoramlanguage;
        this.normalSalary = normalSalary;
        this.bonusSalary = bonusSalary;
    }
    @Override
    public int getSalary() {
        return normalSalary + bonusSalary;
    }
    @Override
    public void showInfo() {
        System.out.println("Employee Name: " + getName() + ", Profession: " + empName + ", Subject: " + prgoramlanguage + ", Salary: " + getSalary()+ " manat");
    }

}
