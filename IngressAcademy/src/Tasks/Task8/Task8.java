package Tasks.Task8;

import java.time.LocalDate;

public class Task8 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now().minusYears(1);
        System.out.println(isLeap(localDate));

    }

    public static boolean isLeap(LocalDate localDate){
        if (localDate.getYear() % 4 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
