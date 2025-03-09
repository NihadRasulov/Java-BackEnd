package Tasks.Task4;

import java.util.Scanner;

public class Tapsiriq7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        System.out.println("You entered this sentence: " + sentence);
        System.out.println("This sentence has " + words.length + " words");
    }
}
