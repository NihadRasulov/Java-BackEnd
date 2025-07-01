package BackendGroup;

public class Student {

    private String name;
    private int age;
    private String university;
    Student(String name, int age, String university){
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void displayInfo(){
        System.out.println("Student: " + getName() + ", Age is " + getAge() + ", Student study at " + getUniversity());
    }

    public static void main(String[] args) {
        Student student1 = new Student("Student1",18,"Khazar University");
        Student student2 = new Student("Student2",22,"Baku State University");
        student1.displayInfo();
        student2.displayInfo();
    }
}
