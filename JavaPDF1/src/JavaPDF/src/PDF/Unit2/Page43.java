package JavaPDF.src.PDF.Unit2;

public class Page43 {

    public static void main(String[] args) {

        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        if(d.snare == true){
            d.playSnare();
        }
        d.playTopHat();
    }
}

class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    void playSnare(){
        System.out.println("bang bang ba-bang");
    }
    void playTopHat(){
        System.out.println("ding ding da-ding");
    }
}