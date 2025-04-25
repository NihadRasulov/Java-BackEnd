package Tasks.Task7.utils;

import java.util.Random;

public class AccountGenerator {

    //    public static void generateAccountNumber() {
    //        return "ACC" + (1000 + new Random().nextInt(9000));
    //    }
    public static String generateAccountNumber() {
        return "ACC" + (1000 + new Random().nextInt(9000));
    }


//    public static void generatePin() {
//        return String.valueOf(1000 + new Random().nextInt(9000));
//    }

    public static String generatePin() {
        return String.valueOf(1000 + new Random().nextInt(9000));
    }
}

