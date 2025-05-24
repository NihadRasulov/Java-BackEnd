package MentorLessons.Month2.Lesson7;

import java.util.ArrayList;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name and grade: ");
        String name = sc.nextLine();
        String[]arr = name.split(" ");

        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add(arr[0]);
        studentNames.add("Suphan");
        studentNames.add("Rovshan");
        studentNames.add("Anar");

        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(Integer.valueOf(arr[1]));
        grades.add(95);
        grades.add(100);
        grades.add(111);

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println("Student: " + studentNames.get(i) + ", Grade: " + grades.get(i));
        }

    }
}
