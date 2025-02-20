package JavaPDF.src.PDF.Unit5;

public class Page118 {
    public static void main(String[] args) {
        Page118 output = new Page118();
        output.go();
    }

    void go() {
        int value = 7;
        for (int i = 1; i < 8; i++) {
            value++;
            if (i > 4) {
                System.out.print(++value + " ");
            }
            if (value > 14) {
                System.out.println(" i = " + i);
                break;
            }
        }
    }
}
