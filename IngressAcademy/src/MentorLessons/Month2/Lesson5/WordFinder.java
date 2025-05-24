package MentorLessons.Month2.Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class WordFinder {

    public static void main(String[] args) {
        wordFinder();
    }
    public static void wordFinder() {
        String word = "programming";
        char[] chars = new char[word.length()];
        Arrays.fill(chars, '_');

        while (Arrays.toString(chars).contains("_")) {
            System.out.print("Enter a character: ");
            char enteredChar = new Scanner(System.in).next().charAt(0);

            if (enteredChar == '0') {
                System.out.println("Current completed word: " + Arrays.toString(chars));
                System.exit(0);
            }

            for (int i = 0; i < word.length(); i++) {
                if (enteredChar == word.charAt(i)) {
                    chars[i] = enteredChar;
                    System.out.println("You found one char: " + enteredChar);
                }
            }
        }

        System.out.println("Complete word: " + word);
    }
}
