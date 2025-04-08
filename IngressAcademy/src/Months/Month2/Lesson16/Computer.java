package Months.Month2.Lesson16;

public class Computer {

    private int price;

    public static int getPrice() {
        return 1700;
    }

    private String brendInfo() {
        return "Asus";
    }

    public String operationSystem() {
        return "Windows" + getPrice();
    }

}


class Notebook extends Computer {

    @Override
    public String operationSystem() {
        return "Linux" + getPrice();
    }

    public static int getPrice() {
        return 2700;
    }

}

class Run {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Notebook notebook = new Notebook();
        Computer computer_notebook = new Notebook();
        
        System.out.println(computer.operationSystem());
        System.out.println(notebook.operationSystem());
        System.out.println(computer_notebook.operationSystem());

//        System.out.println(computer.getPrice());
//        System.out.println(notebook.getPrice());
//        System.out.println(computer_notebook.getPrice());


    }
}