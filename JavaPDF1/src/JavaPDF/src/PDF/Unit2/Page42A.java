package JavaPDF.src.PDF.Unit2;

class Page42A {
    String title;
    String artist;
    int duration;

    void play() {
        System.out.println("Playing song");
    }
    void printDetails(){
        System.out.println("This is:" + title + "by " + artist);
        System.out.println("Duration: " + duration + " seconds");
    }
}


class SongMethod{

    public static void main(String[] args) {

        Page42A song = new Page42A();
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.duration = 140;
        song.play();
        song.printDetails();
    }
}