package University.src.Test;

public class Employers {
    private String employerName;
    private int employerage;

    public Employers(String employerName, int employerage) {
        this.employerName = employerName;
        this.employerage = employerage;
    }
    public String getEmployerName() {
        return employerName;
    }
    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }
    public int getEmployerage() {
        return employerage;
    }
    public void setEmployerage(int employerage) {
        this.employerage = employerage;
    }
    public void printEmployers() {
        System.out.println(employerName + " " + employerage);
    }

    public static void main(String[] args) {

        Developer employer = new Developer("John Doe", "Software Developer", 10000);
        employer.printEmployers();
        employer.getBonus();
    }
}
