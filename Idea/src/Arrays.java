import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Arrays {

    public static void main(String[] args) {

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Hello");
//        arrayList.add("World");
//
//        String []arr = arrayList.toArray(new String[arrayList.size()]);


//        System.out.println(java.util.Arrays.toString(arr));


//        String []arr = new String[]{"Hello","World"};
//
////        ArrayList<String> arrayList = new ArrayList<>(List.of(arr));
//        List<String> array = java.util.Arrays.asList(arr);
//        System.out.println(array);


        String []arr = new String[]{"H","W"};

        ArrayList<String> arrayList = new ArrayList<>(java.util.Arrays.asList(arr));

        System.out.println(arrayList);
        arrayList.add("Hello");
        System.out.println(arrayList.size());

    }
}
