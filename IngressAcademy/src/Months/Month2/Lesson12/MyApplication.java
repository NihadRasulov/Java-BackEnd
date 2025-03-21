package Months.Month2.Lesson12;

import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {

    static int value;
    public MyApplication() {
        value++;
    }

    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();
//
//
//        list.add("D");
//        list.add("E");
//        list.add("F");
//        list.add("A");
//        list.add("B");
//        list.add("C");
//
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

        System.out.println(MyApplication.value);
        MyApplication app = new MyApplication();
        System.out.println(app.value);
    }
}
