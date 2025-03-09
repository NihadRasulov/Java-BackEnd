package Months.Month2.Lesson9;

public class Lesson9 {

    public static void main(String[] args) {
        String name = "    ingress ACADEMY,,,    ";
        String email = "  Ingress.aca@GMAIL.com  ";

        name = name.replaceAll("[,\t ]"," ").trim();
        email = email.replaceAll("[,\t ]"," ").trim().toLowerCase();

        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(name);
        System.out.println(email);


    }
}
