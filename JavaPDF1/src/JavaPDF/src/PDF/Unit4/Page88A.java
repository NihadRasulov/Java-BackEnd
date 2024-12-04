package JavaPDF.src.PDF.Unit4;

public class Page88A {

    public static void main(String[] args) {

        int orig = 42;
        Page88A x = new Page88A();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    int go(int arg) {
        arg = arg*2;
        return arg;
    }
}
