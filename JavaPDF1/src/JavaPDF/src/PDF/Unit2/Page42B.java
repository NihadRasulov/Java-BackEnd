package JavaPDF.src.PDF.Unit2;

public class Page42B {
    int seriesNumber;
    int episodeNumber;

    void play(){
        System.out.println("Playing episode " + episodeNumber);
    }
    void skipIntro(){
        System.out.println("Skipping Intro...");
    }

    void skipToNext(){
        System.out.println("Skipping next page...");
    }
}

class Episode{

    public static void main(String[] args) {

        Page42B series = new Page42B();
        series.seriesNumber = 4;
        series.play();
        series.skipIntro();
    }
}