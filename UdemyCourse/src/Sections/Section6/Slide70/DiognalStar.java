package Sections.Section6.Slide70;

public class DiognalStar {

    public static void main(String[] args) {

        printSquareStar(20);
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int row = 1; row <= number; row++) {  // Iterate over each row
            for (int column = 1; column <= number; column++) {  // Iterate over each column
                boolean isFirstRowOrColumn = row == 1 || column == 1; // if either row or column equals 1, assign true to isFirstRowOrColumn.
                boolean isLastRowOrColumn = row == number || column == number; // if either row or column equals number, assign true to isLastRowOrColumn.
                boolean isDiagonal = (row == column) || (column == (number - row + 1));  // if either row equals column, or column equals number minus row plus 1, assign true to isFirstRowOrColumn.
                if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line

        }
    }
}
