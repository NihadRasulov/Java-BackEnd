package Task3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner string = new Scanner(System.in);
        System.out.print("Please enter the word: ");
        String word = string.nextLine();

        if (!word.isEmpty()) {

            char lastChar = word.charAt(word.length() - 1);
            lastChar = Character.toLowerCase(lastChar);

            if (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u') {
                System.out.println("The last character is a vowel.");
            } else {
                System.out.println("The last character is not a vowel.");
            }
        }
//        else if(word.matches("[a-zA-Z]+")) {
//            System.out.println("You don't entered any word.");
//        }    ???
    }
}
