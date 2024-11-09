package Task3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner String = new Scanner(System.in);
        System.out.print("Enter the your word:");
        String word = String.nextLine();
        if(!word.isEmpty()){
            char lastLetter = word.charAt(word.length() - 1);
            System.out.println("Your word's last letter is: " + lastLetter);

        }
        else{
            System.out.println("You can not input a word");
        }

        }
    }

