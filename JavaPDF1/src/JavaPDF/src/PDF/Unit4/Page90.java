package JavaPDF.src.PDF.Unit4;

public class Page90 {
        int counter = 0;
        public static void main(String[] args) {
            int count = 0;
            Page90[] mixes = new Page90[20];
            int i = 0;
            while (i<9) {
                mixes[i] = new Page90();
                mixes[i].counter = mixes[i].counter + 1;
                count = count + 1;
                count = count + mixes[i].maybeNew(i);
                i = i + 1;
            }
            System.out.println(count + " " +
                    mixes[1].counter);
        }
        public int maybeNew(int index) {
            if (index < 5) {
                Page90 mix = new Page90();
                mix.counter = mix.counter + 1;
                return 1;
            }
            return 0;
        }
}
