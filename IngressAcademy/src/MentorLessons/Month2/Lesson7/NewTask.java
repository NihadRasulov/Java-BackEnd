package MentorLessons.Month2.Lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NewTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        ArrayList<String> arrayWord = new ArrayList<>();
        arrayWord.addAll(Arrays.asList(words));

        String maxWord = "";
        int length = words[0].length();

        for (String string : arrayWord) {

            if (string.length() > length) {
                length = string.length();
                maxWord = string;
            }
        }
        System.out.println(maxWord);
    }
}
