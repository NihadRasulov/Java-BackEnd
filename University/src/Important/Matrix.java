package Important;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];

        System.out.println("Enter 9 integers to fill the 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                Scanner number = new Scanner(System.in);
                System.out.print("Enter value for position [" + i + "][" + j + "]: ");
                matrix[i][j] = number.nextInt();
            }
        }

        System.out.println("The entered 3x3 matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
