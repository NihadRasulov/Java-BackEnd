package JavaPDF.src.PDF.Unit4;

public class Page88B {

    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("Time is: " + tod);
    }
}

class Clock {
    String time;

    void setTime(String t) {
        this.time = t;
    }

    String getTime() {
        return time;
    }
}