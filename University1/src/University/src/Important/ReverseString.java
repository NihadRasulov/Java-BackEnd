package University.src.Important;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = st.next();
        System.out.println("The length of the string is: " + string.length());
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
    }
}
