package MentorLessons.Lesson2;

import java.util.Scanner;

public class GradeSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter your grade: ");
//        int grade = sc.nextInt();
//        while (true) {
//            if (grade < 0 || grade > 100) {
//                System.out.println("You entered incorrect grade: " + grade);
//                System.out.print("Please enter a valid grade: ");
//                grade = sc.nextInt();
//                continue;
//            } else if (grade > 90 || grade == 100) {
//                System.out.println("Your grade is A and number of grade is: " + grade);
//            } else if (grade > 80) {
//                System.out.println("Your grade is B and number of grade is: " + grade);
//            } else if (grade > 70) {
//                System.out.println("Your grade is C and number of grade is: " + grade);
//            } else if (grade > 60) {
//                System.out.println("Your grade is D and number of grade is: " + grade);
//            } else if (grade > 50) {
//                System.out.println("Your grade is E and number of grade is: " + grade);
//            } else {
//                System.out.println("You failed! Because your grade is less than 51");
//            }
//            break;
//        }

        Student1 student = new Student1();
        System.out.print("Please enter your name: ");
        student.name = sc.nextLine();
        System.out.print("Please enter your grade: ");
        student.grade = sc.nextInt();

        while (true) {
            if (student.grade < 0 || student.grade > 100) {
                System.out.println("You entered incorrect grade: " + student.grade);
                System.out.print("Please enter a valid grade: ");
                student.grade = sc.nextInt();
                continue;
            } else if (student.grade > 90 || student.grade == 100) {
                System.out.println("Your name is: " + student.name + ", Your grade is A and number of grade is: " + student.grade);
            } else if (student.grade > 80) {
                System.out.println("Your name is: " + student.name + ", Your grade is B and number of grade is: " + student.grade);
            } else if (student.grade > 70) {
                System.out.println("Your name is: " + student.name + ", Your grade is C and number of grade is: " + student.grade);
            } else if (student.grade > 60) {
                System.out.println("Your name is: " + student.name + ", Your grade is D and number of grade is: " + student.grade);
            } else if (student.grade > 50) {
                System.out.println("Your name is: " + student.name + ", Your grade is E and number of grade is: " + student.grade);
            } else {
                System.out.println("You failed! Because your grade is less than 51");
            }
            break;
        }
    }
}
