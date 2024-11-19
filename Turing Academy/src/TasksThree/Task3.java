package TasksThree;

import  java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a word: ");
            String word = scan.nextLine();

            if(!word.isEmpty()) {
                String wordreverse = word.toUpperCase();
                for (int i = wordreverse.length() - 1; i >= 0; i--) {
                    System.out.print(wordreverse.charAt(i));
                }
            }
            else {
                System.out.println("No word entered");
            }
    }
}
