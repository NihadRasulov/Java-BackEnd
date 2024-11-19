package Udemy;

public class ClassVariable {

    public static void main(String[] args){

        Var ad = new Var();
        ad.name = "Nihad";
        ad.age = 18;
        System.out.println("The name is " + ad.name);
        System.out.println("The age is " + ad.age);

    }
}

class Var {

    String name;
    int age;
}
