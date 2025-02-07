package University.src.EmployeeClassExample;

public class MainRunClass {

    public static void main(String[] args) {
        Teacher d1 = new Teacher("Ali Hoca","OOP",50,20);
        d1.showInfo();

        Developer d2 = new Developer("Nihad","Software Developer","Java and JavaScript",5000,1000);
        d2.showInfo();

    }
}
