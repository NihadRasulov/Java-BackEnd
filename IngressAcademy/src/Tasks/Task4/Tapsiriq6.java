package Tasks.Task4;

import java.util.Scanner;

public class Tapsiriq6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = sc.nextLine();

        System.out.print("Please enter which letter you want to search: ");
        String letter = sc.nextLine();

        if (word.contains(letter)) {
            System.out.println("You searched: " + letter);
            System.out.println("Letter's index is: " + word.indexOf(letter));
        }
        else {
            System.out.println("This letter is not found");
        }
    }
}
