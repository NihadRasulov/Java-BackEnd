package Polymorphism.Exrecise40;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";

    }
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
    public int getCylinders() {
        return cylinders;
    }
    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders,name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders,name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";

    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders,name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}