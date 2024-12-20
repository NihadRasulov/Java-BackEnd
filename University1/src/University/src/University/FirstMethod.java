package University.src.University;

public class FirstMethod {

    static String mymethod(int a, int b, String name) {
        int toplam = a + b;
        return "Toplam: " + toplam + " Name: " + name;

    }
    public static void main(String[] args) {
        System.out.println(mymethod(5,6,"Nihat"));

    }
}
