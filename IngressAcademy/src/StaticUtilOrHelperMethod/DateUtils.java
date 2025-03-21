package StaticUtilOrHelperMethod;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    // Get the current date as a formatted string
    public static String getCurrentDate(String format) { // YYYY-mmm-dd
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDate.now().format(formatter);
    }

    // Parse a string to LocalDate
    public static LocalDate parseDate(String date, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDate.parse(date, formatter);
    }
}

