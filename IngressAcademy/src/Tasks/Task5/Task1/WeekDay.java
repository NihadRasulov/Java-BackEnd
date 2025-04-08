package Tasks.Task5.Task1;

public enum WeekDay {

    MONDAY(true),TUESDAY(true),WEDNESDAY(true),THURSDAY(true),FRIDAY(true),SATURDAY(false),SUNDAY(false);

    boolean isWeekDay;

    WeekDay(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public boolean isWeekDay() {
        return isWeekDay;
    }
}
