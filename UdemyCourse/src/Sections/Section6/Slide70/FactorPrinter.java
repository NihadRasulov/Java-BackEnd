package Sections.Section6.Slide70;

public class FactorPrinter {

    public static void main(String[] args) {

        printFactors(15);
    }
    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
