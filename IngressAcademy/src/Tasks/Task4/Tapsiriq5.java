package Tasks.Task4;

public class Tapsiriq5 {

    public static void main(String[] args) {

        String a = "CAT";
        String b = "CAT";
        System.out.println(a == b);

        /*
        * The result is True
        * because this a and b create stack
        * but these value create heap string pool
        * first create value a heap string pool then b is connected to a's value because a and b value equal
        * they are same place string pool
        * so they value equal also they reference same
        *
        * */
    }
}
