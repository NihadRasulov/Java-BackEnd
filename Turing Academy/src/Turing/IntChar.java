package Turing;

public class IntChar {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j % 2 == 0 || i % 2 == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
