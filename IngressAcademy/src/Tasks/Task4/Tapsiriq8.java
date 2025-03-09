package Tasks.Task4;

import java.util.Scanner;

public class Tapsiriq8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = sc.next();

        System.out.println("This word first letter is: " + word.charAt(0));
        System.out.println("This word last letter is: " + word.charAt(word.length()-1));
    }
}
