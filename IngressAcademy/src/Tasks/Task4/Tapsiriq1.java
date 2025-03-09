package Tasks.Task4;

public class Tapsiriq1 {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            stringBuilder.append(i).append(",");
        }
        String word = stringBuilder.toString();
        System.out.println(word);
    }
}
