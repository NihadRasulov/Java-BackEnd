package Tasks.Task4;

public class Tapsiriq11 {

    public static void modify(String s) { s = s.concat("!"); }

    public static void main(String[] args) {

        String str = "Hello";

        modify(str);

        System.out.println(str);

        /*
        * str oldugu kimi cap olunacaq cunki string is immutable so our method create new string and after method
        * this string remove so our string don't change
        * */
    }
}
