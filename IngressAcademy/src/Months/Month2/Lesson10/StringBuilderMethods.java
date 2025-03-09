package Months.Month2.Lesson10;

import java.util.Arrays;

public class StringBuilderMethods {

    public static void main(String[] args) {
        StringBuffer stringBuilder = new StringBuffer("Ingressasd");
        char symbol = stringBuilder.charAt(0);
        System.out.println(symbol);

        int index = stringBuilder.indexOf("s");
        System.out.println(index);

        index = stringBuilder.lastIndexOf("s");
        System.out.println(index);

        System.out.println(stringBuilder);
//        index = stringBuilder.indexOf("s", stringBuilder.);
//        System.out.println(index);
        String sub = stringBuilder.substring(6);
        System.out.println(stringBuilder);

        stringBuilder.insert(1,'@');
        System.out.println(stringBuilder);

        stringBuilder.insert(1,false);
        System.out.println(stringBuilder);

        stringBuilder.insert(1, Arrays.toString(new int []{1,2,3}));
        System.out.println(stringBuilder);

        System.out.println(stringBuilder);
        stringBuilder.delete(5,10);
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        stringBuilder.replace(0,10, "*");
        System.out.println(stringBuilder);

        String s = stringBuilder.toString();
        String [] sArray =  s.split(",");
        Arrays.stream(sArray).forEach(s1 -> System.out.println(s1));

    }
}
