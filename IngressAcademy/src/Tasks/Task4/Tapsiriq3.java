package Tasks.Task4;

public class Tapsiriq3 {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A").insert(0,"B").append("C").reverse().insert(1,"D");
        System.out.println(stringBuilder);
    }
}
