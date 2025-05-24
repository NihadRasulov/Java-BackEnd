package MentorLessons.Month3.Lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>  {

    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.salary == o.salary){
            return this.name.compareTo(o.name);
        }
        return Integer.compare(this.salary,o.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

//        ZoneId.getAvailableZoneIds().stream().sorted().forEachOrdered(System.out::println);
//        System.out.println(ZoneId.systemDefault());

        Employee employee1 = new Employee("Nihad",3000);
        Employee employee2 = new Employee("Babek",1000);
        Employee employee3 = new Employee("Anar",4000);

        List<Employee> array = new ArrayList<>();
        array.add(employee1);
        array.add(employee2);
        array.add(employee3);

        Collections.sort(array);

        for (Employee s:array){
            System.out.println(s);
        }
        // Big Decimal search
    }
}
