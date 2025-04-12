package Task;

import java.util.Scanner;
public class Vowel_Count {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Please enter a word: ");
        String word = input.next();
        word = word.toLowerCase();
        int count = 0;
        for (int i=0;i<=word.length()-1;i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("In your word has: " + count + " vowel");
    }
}
