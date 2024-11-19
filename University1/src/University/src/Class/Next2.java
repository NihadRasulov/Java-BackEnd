package University.src.Class;

import java.util.Scanner;

public class Next2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Product Display!");

        while (true) {
            System.out.print("Enter product name (or 'exit' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            Next product = new Next(name, price);
            product.display();
        }

    }
}