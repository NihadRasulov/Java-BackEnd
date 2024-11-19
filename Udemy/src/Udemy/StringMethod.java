package Udemy;

public class StringMethod {

    public static void main(String[] args) {

        String str1 = "Hello World " + " Welcome to Java";
        String str2 = "Welcome";
        String str3 = "";
        String str4 = "abc, def, ghi";
        String str5 = "     String";
        String [] strCount = str4.split("\\s+");
        System.out.println(strCount.length);
        System.out.println(str1.length());
        System.out.println(str1.substring(1));
        System.out.println(str1.substring(6,13));
        System.out.println(str1.contains("Hello"));
        System.out.println(str2.equals("welcome"));
        System.out.println(str2.equalsIgnoreCase("welcome"));
        System.out.println(str3.isEmpty());

        System.out.println(str5.trim());
    }
}
