package Tasks.Task4;

import java.util.Arrays;

public class Tapsiriq9 {

    public static void main(String[] args) {
        anagram("Salam","Slama");
        anagram("Salam","Hello");
    }

    public static void anagram(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        if (Arrays.equals(word1Array, word2Array)) {
            System.out.println("This word is anagram");
        }
        else {
            System.out.println("This word is not anagram");
        }
    }
}
