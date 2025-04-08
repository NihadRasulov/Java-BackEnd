package Sections.Section10.Slide136;

import java.util.*;

public class ArrayListChallange {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Available actions: " + "\n0 - to shutdown" + "\n1 - to add item(s) to list (comma delimited list)" +
                "\n2 - to remove any items (comma delimited list)");
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.print("Enter a number for which action you want to do: ");
            int action = sc.nextInt();
            switch (action) {
                case 1:
                    System.out.print("Please enter what you want to add: ");
                    list.add(sc.next());
                    System.out.println("Item was added to the list");
                    System.out.println("List : " + list);
                    break;
                case 2:
                    System.out.print("Please enter what you want to remove: ");
                    String item = sc.next();
                    if (list.contains(item)) {
                        list.remove(item);
                        System.out.println("Item removed");
                        System.out.println("List: " + list);
                    } else {
                        System.out.println("Item not found");
                        System.out.println("List: " + list);
                    }
                    break;
                case 0:
                    System.out.println("List is: " + list);
                    list.sort(Comparator.naturalOrder());
                    System.out.println("Sorted list: " + list);
                    check = false;
                    break;
                default:
                    System.out.println("Please enter valid action!");
            }
        }
    }
}
