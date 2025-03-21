package Months.Month2.Lesson13;

public class MethodOverloading {

    // Compile time Polimorfizm , Static polimorfizm
    // Overloading metodun return tipininn ferqliliyini desteklemir.
    // OverLoading metodun parametr sayini destekleyir.
    // MEtodun parametrinde olan tip ferqliliyi overloadingi destekleyir
    // Access modifier deyishikliyi overloadi desteklemir
    // Parametr sayi eyni ancaq yer deyishikliiyi overloadi destekleyir (vararg xaric)
    // Parennt Child parametr tiplerri overloadi destekleyir
    // Wrapper tipler overloadi destekleyir
    // Primitive tip ferqliliyi overloadi destekleyir.
    // vararg ve array birlikde overloadi destekleMIR
    public void read() {
    }
    public void read(String text) {
    }
    //    public void read(Object text) {
//    }
    public void read(boolean text) {
    }
    public void read(int number) {
    }
    public void read(long number) {
    }
    public void read(byte number) {
    }
    public void read(int [] number) {
    }

    public void read(String [] values ,int ... number) {
    }
//    public void read(int ... number , String [] values) { // DoesNot compile
//    }
//    public void read(Integer number) {
//    }


    public void read(int number, String text) {
    }
    public void read(String text, int number) {
    }

    public void read(Object [] text) {
        text = new String[] {"One"};
    }

    //    private void read(int text){} Does not Compile
//    public String read(String text){return null;}  Does not Compile
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
//        methodOverloading.read(15, "Text");
//        methodOverloading.read("Text", 15);
//        methodOverloading.read("String value");
//        methodOverloading.read(true);
//        methodOverloading.read(568);
//        methodOverloading.read(Integer.valueOf(568));
//        methodOverloading.read((byte)5);
        methodOverloading.read(Integer.valueOf(125));
//        methodOverloading.read(new String [] {"One"}, 2, 5, 6988);


    }
}
