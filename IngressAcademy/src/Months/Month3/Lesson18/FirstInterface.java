package Months.Month3.Lesson18;

public interface FirstInterface {
    /*
     * Abstract method
     * constant variable
     * Not allow static initilsation or instance initilisor
     *
     * */
    void abstractMethod();

    String v = "Salam";

    default void defaultMethod() {
        System.out.println("Default Method");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }

    private void privateMethod() {

    }

    
}
