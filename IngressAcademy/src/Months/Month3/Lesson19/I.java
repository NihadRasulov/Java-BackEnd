package Months.Month3.Lesson19;

public interface I {
}
class A implements I{
}
class B extends A{
}
class C extends B{
}

class Run {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
//        a =b;    Parent class child class'in objectioni ozunde saxlaya biler
//        b= (B) a; // run time ClassCastException. Biz cast etsek de child class parent class'in objectini saxlaya bilmez
//        b = (B)(I)a; // this same as b= (B) a because cast (I) is nothing in here
        a = (B)(I)b;



    }
}