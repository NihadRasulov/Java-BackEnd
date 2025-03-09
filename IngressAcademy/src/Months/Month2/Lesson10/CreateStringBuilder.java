package Months.Month2.Lesson10;

public class CreateStringBuilder {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Java");
//        System.out.println(stringBuilder);
//        stringBuilder.append("OCA");
//        System.out.println(stringBuilder);
//        StringBuilder stringBuilderCustom = new StringBuilder(1000);
//        StringBuilder stringBuilderWithValue = new StringBuilder("Ingress");
//        StringBuilder builder = "OCA";

        String a = new String("abc");
        String b = a.concat("de");
        b = b.concat("f").concat("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
