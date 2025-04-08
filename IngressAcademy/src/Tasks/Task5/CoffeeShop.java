package Tasks.Task5;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {

        static List<Coffee> coffeeList = new ArrayList<>();
        public void addCoffee(Coffee coffee) {
            coffeeList.add(coffee);
        }

    public static void main(String[] args) {

        CoffeeShop coffeeShop = new CoffeeShop();

        Coffee coffee1 = new Coffee("Coffee",CoffeeSize.SMALL,true,true);
        Coffee coffee2 = new Coffee("Coffee",CoffeeSize.MEDIUM,true,false);
        Coffee coffee3 = new Coffee("Coffee",CoffeeSize.LARGE,false,false);
        coffeeShop.addCoffee(coffee1);
        coffeeShop.addCoffee(coffee2);
        coffeeShop.addCoffee(coffee3);

        for (int i=0;i<coffeeList.size();i++) {
            coffeeList.get(i).print();
        }
    }


}

class Coffee {
    String name;
    CoffeeSize size;
    boolean milk;
    boolean sugar;
    public Coffee(String name,CoffeeSize size, boolean milk, boolean sugar) {
        this.name = name;
        this.size = size;
        this.milk = milk;
        this.sugar = sugar;
    }
    public void print() {
        System.out.println("Coffee name: " + name + " ,coffee size: " + size +
                " , coffee with milk: " + (milk ? "Yes" : "No") +
                " , coffee with sugar: " + (sugar ? "Yes" : "No"));
    }
}
enum CoffeeSize {
    SMALL, MEDIUM, LARGE;
}