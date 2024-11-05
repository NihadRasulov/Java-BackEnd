import java.util.Scanner;

public class Duzbucaqli {

    public static void main(String[] args) {


        while(true) {
            Scanner number = new Scanner(System.in);
            System.out.print("Please enter Triangle side 1: ");
            int side1 = number.nextInt();
            System.out.print("Please enter Triangle side 2: ");
            int side2 = number.nextInt();
            System.out.print("Please enter Triangle side 3: ");
            int side3 = number.nextInt();

            if(side1 >1000 || side2 >1000 || side3 >1000){
                System.out.println("The triangle side is too big.Try again!");
                continue;
            }
                int a = side1 * side1;
                int b = side2 * side2;
                int c = side3 * side3;
                if (a + b == c || a + c == b || b + c == a) {
                    System.out.println("The Triangle is a Duzbucaqli Triangle");
                } else if (side1 == (side2 = side3)) {
                    System.out.println("The Triangle is a Equal Triangle");
                } else {
                    System.out.println("The Triangle isn't a Duzbucaqli Triangle");
                }
                break;
        }
    }
}
