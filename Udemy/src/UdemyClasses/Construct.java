package UdemyClasses;

class Customer{

    public Customer(){
        System.out.println("Welcome to Customer Class");
    }

    public void name(String name1){
        System.out.println("Customer name is: " + name1);
    }
}

public class Construct {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.name("John");

    }
}
