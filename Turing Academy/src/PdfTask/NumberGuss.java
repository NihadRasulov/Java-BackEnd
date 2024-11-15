package PdfTask;

import java.util.Scanner;

public class NumberGuss {

    public static void main(String[] args) {

        System.out.print("Enter a guess number 1 to 100: ");
        Scanner numberGuess = new Scanner(System.in);
        int guessNumber;
        int a = (int) (Math.random() * 101);

        while (true) {

            if (numberGuess.hasNextInt()) {
                guessNumber = numberGuess.nextInt();

                if (guessNumber > 0 && guessNumber <= 100) {
                    if (guessNumber < a) {
                        System.out.println("Too low! Try again.");
                    }
                    else if (guessNumber > a) {
                        System.out.println("Too high! Try again.");
                    }
                    else {
                        System.out.println("You guessed the correct number: " + a);
                        break;
                    }
                }
                else {
                    System.out.println("Please enter a number between 1 and 100.");
                }
            }
            else {
                System.out.println("Invalid input! Please enter a valid integer.");
                numberGuess.nextInt();
            }
            System.out.print("Enter your guess number again: ");
        }
    }
}
