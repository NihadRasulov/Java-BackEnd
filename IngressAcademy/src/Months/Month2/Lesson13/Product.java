package Months.Month2.Lesson13;

public class Product {

    String name;
    double price;
    double discount = 0;
    String category = "Unknown";
    int stockQuantity = 0;
    String brand = "Unknown";

    public Product() {}
    public Product(String name,double price) {
        this.name = name;
        this.price = price;
    }
    public Product(String name,double price,double discount) {
        this(name ,price);
        this.discount = discount;
    }
    public Product(String name,double price,double discount,String category) {
        this(name ,price,discount);
        this.category = category;
    }
    public Product(String name,double price,double discount,String category,int stockQuantity,String brand) {
        this(name ,price,discount,category);
        this.stockQuantity = stockQuantity;
        this.brand = brand;
    }

//    public String toString() {
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                ", discount=" + discount +
//                ", category='" + category + '\'' +
//                ", stockQuantity=" + stockQuantity +
//                ", brand='" + brand + '\'' +
//                '}';
//    }
//    public void productInfo() {
//        System.out.println("Product: " + name + ", Price: " + price + ", Discount: " + discount + ", Stock Quantity: " + stockQuantity + ", Brand: " + brand);
//    }

    public static void main(String[] args) {


        Product one = new Product("Phone",500);
        Product two = new Product("Notebook",2000,150);
        Product three = new Product("PC",5000,400,"Technologies");
        Product four = new Product("WasherMachine",1500,100,"Home tools",12,"LG");


        System.out.println(one);
//        one.productInfo();
//        System.out.println("------------------------------------------------------------------------------");
//        two.productInfo();
//        System.out.println("------------------------------------------------------------------------------");
//        three.productInfo();
//        System.out.println("------------------------------------------------------------------------------");
//        four.productInfo();
    }
}
