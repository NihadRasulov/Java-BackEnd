package Sections.Section6.Slide62;

public class MiniChallange {

    public static void main(String[] args) {

        for(double rate=7.5;rate<=10;rate+=0.25) {
            System.out.println("Result is: " + calculateInterest(100,rate));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return amount * interestRate/100;
    }
}
