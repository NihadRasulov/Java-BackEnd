package MentorLessons.Lesson8;

import java.util.Scanner;

public class Product {

    String name;
    private double price;
    private int stock;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double userPrice) {
        if (userPrice < 0) {
            System.out.println("Price can not be negative");
        } else {
            this.price = userPrice;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int userStock) {
        if (userStock < 0) {
            System.out.println("Stock can not be negative");
        } else {
            this.stock = userStock;
        }
    }

    public void increaseStock(int increase) {
        if (increase <= 0 ) {
            System.out.println("You can not increase stock with negative number");
        } else {
            this.stock += increase;
        }
    }
    public void decreaseStock(int decrease) {
        if (decrease <= 0) {
            System.out.println("You can not decrease stock with negative number");
        } else if (this.stock < decrease) {
            System.out.println("Stock is: " + this.stock + "\nYou want to decrease: " + decrease + " this is not allowed");
        }
        else {
            this.stock-=decrease;
        }
    }

    public static void main(String[] args) {

        Product product = new Product("Phone",100,30);
        product.setStock(10);
        product.decreaseStock(15);
        product.increaseStock(10);
        System.out.println(product.getStock());
        product.decreaseStock(-15);
        System.out.println(product.getStock());
        product.setPrice(-12);
        System.out.println(product.getPrice());

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter product name: ");
//        String name = sc.nextLine();
//        System.out.print("Please enter how much money you want to sell: ");
//        double price = sc.nextDouble();
//        System.out.print("Please enter how many you have stock: ");
//        int stock = sc.nextInt();
//
//        Product product1 = new Product(name);
//        product1.setPrice(price);
//        product1.setStock(stock);
//
//        System.out.print("Please enter how much you want to decrease stock: ");
//        int decrease = sc.nextInt();
//        product1.decreaseStock(decrease);


    }

}
