import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Please enter Triangle side 1: ");
        int side1 = number.nextInt();
        System.out.print("Please enter Triangle side 2: ");
        int side2 = number.nextInt();
        System.out.print("Please enter Triangle side 3: ");
        int side3 = number.nextInt();

            if (side1 < 1000 && side2 < 1000 && side3 < 1000) {
                int a = side1 * side1;
                int b = side2 * side2;
                int c = side3 * side3;
                if (a + b == c) {
                    System.out.println("The Triangle is a Duzbucaqli Triangle");
                } else if (a + c == b) {
                    System.out.println("The Triangle is a Duzbucaqli Triangle");
                } else if (b + c == a) {
                    System.out.println("The Triangle is a Duzbucaqli Triangle");
                } else {
                    System.out.println("The Triangle isn't a Duzbucaqli Triangle");
                }
            } else {
                System.out.println("The triangle sides is too big");
            }

    }
}
