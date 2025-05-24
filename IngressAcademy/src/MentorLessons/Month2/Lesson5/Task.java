package MentorLessons.Month2.Lesson5;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        String word = new Scanner(System.in).nextLine();
        System.out.println(
                word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()
        );
    }
}
