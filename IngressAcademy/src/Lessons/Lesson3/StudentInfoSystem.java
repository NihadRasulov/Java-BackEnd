package Lessons.Lesson3;

import java.util.Scanner;

public class StudentInfoSystem {
    String name;
    int age;
    int score;

//    public void getStudentInfo() {
//        String studentName = name;
//        int studentAge = age;
//        int studentScore = score;
//    }
    public void displayInfo() {
        System.out.println("Your name is " + name + "\nYour age is " + age + "\nYour score is " + score + "\n");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.next();
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        System.out.print("Please enter your score: ");
        int score = sc.nextInt();
        StudentInfoSystem studentInfoSystem = new StudentInfoSystem();
        studentInfoSystem.name = name;
        studentInfoSystem.age = age;
        studentInfoSystem.score = score;
        studentInfoSystem.displayInfo();
    }
}
