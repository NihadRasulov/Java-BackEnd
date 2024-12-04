public class New {

    public static void main(String[] args) {

        New1 n = new New1();
        System.out.println(n.Number(5));

    }
}

class New1 {

    int a;

    public int Number( int a) {
        int value;
        value = a + 5;
        return value;
    }
}