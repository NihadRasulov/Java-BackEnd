package Months.Month2.Lesson11;

import java.util.ArrayList;

public class Lesson11 {

    public static void main(String[] args) {

//        StringBuilder s = new StringBuilder("Hello");
//        String s1 = "Hello";
//
//        System.out.println(s1.equals(s));
//        System.out.println(s.equals(s1));


        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Read Book");
        arrayList.add("Write Report");
        arrayList.add("Review Code");
        arrayList.add("Fix Bug");
        arrayList.add("Submit Task");
        System.out.println("Siyahinin ilkin veziyyeti: " + arrayList);
        System.out.println();
        String lastIndex = arrayList.get(arrayList.size()-1);
        String firstIndex = arrayList.get(0);

        arrayList.remove("Read Book");
        arrayList.remove("Submit Task");

        arrayList.add(firstIndex);
        arrayList.add(0,lastIndex);

        System.out.println("Deyisdirilmis siyahi: " + arrayList);
        System.out.println();
        arrayList.remove(0);

        System.out.println("Ilk tapsiriq silindi: " + arrayList);
        System.out.println();

        System.out.println("Siyahi bosdur? " + arrayList.isEmpty());
        System.out.println();

        arrayList.add("Test Application");
        System.out.println("Yeni tapsiriq elave edildi: " + arrayList);
        System.out.println();

        System.out.println("Siyahinin olcusu: " + arrayList.size());
        System.out.println();

        if (arrayList.contains("Review Code")) {
            arrayList.remove("Review Code");
        }
        
        System.out.println("Yekun siyahi:" + arrayList);
        System.out.println();

        arrayList.clear();
        System.out.println("Siyahi tam temizlendi: " + arrayList);



    }
}
