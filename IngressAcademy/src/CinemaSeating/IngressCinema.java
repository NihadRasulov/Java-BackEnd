package CinemaSeating;

import java.util.Scanner;

public class IngressCinema {

    public static void main(String[] args) {

        String[][] arrays = new String[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arrays[i][j] = "O";
            }
        }
        System.out.println("Welcome to Ingress Cinema!");
        System.out.println("Please select option: \n" + "1.Reserve Seat\n" + "2.See avialable seats\n" + "3.Exit");

        boolean next = false;
        Scanner sc = new Scanner(System.in);
        while (!next) {
            System.out.print("Please enter an option: ");
            int option = sc.nextInt();
            if (option <= 0 || option > 3) {
                System.out.print("Please enter a valid option: ");
            } else {
                switch (option) {
                    case 1:
                        System.out.print("Please enter the seat number to row: ");
                        String row = sc.next();
                        System.out.print("Please enter the seat number to column: ");
                        String col = sc.next();
                        while (true) {
                            int row1 = Integer.parseInt(row) - 1;
                            int col1 = Integer.parseInt(col) - 1;
                            if ((row1 >= 0 && row1 < 5) && (col1 >= 0 && col1 < 5)) {
                                System.out.println("You reserved " + row + " " + col + " seat");
                                arrays[row1][col1] = "X";
                                break;
                            } else if ((row1 < 0 || row1 > 5) && (col1 >= 0 && col1 < 5)) {
                                System.out.print("Please enter the valid seat number to row: ");
                                row = sc.next();
                            } else if ((col1 < 0 || col1 > 5) && (row1 >= 0 && row1 < 5)) {
                                System.out.print("Please enter the valid seat number to column: ");
                                col = sc.next();
                            } else {
                                System.out.print("Please enter the valid seat number to row: ");
                                row = sc.next();
                                System.out.print("Please enter the valid seat number to column: ");
                                col = sc.next();
                            }

                        }
                        break;
                    case 2:
                        System.out.println("This is available seats!");
                        for (String[] num : arrays) {
                            System.out.println();
                            for (String num1 : num) {
                                System.out.print(num1 + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        next = true;
                        break;
                }
            }
        }
        displaySeats(arrays);
    }

    public static void displaySeats(String arrays[][]) {
        System.out.println("Seats:");
        for (String[] i : arrays) {
            System.out.println();
            for (String j : i) {
                System.out.print(j + " ");
            }
        }
    }
}
