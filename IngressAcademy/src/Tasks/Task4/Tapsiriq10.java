package Tasks.Task4;

public class Tapsiriq10 {

    public static void main(String[] args) {

        String word = "Hello WoRlD";

        StringBuilder result = new StringBuilder();

        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        System.out.println("Changed word is: " + result);
    }
}
