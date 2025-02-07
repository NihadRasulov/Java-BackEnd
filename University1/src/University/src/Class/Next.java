package University.src.Class;

class Next {
    public String name;
    public double price;

    public Next(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {

        System.out.println("Product Name: " + name + ", Price: $" + price);
    }
}
