package JavaPDF.src.PDF.Unit3;

public class Page65 {

    double area;
    int height;
    int length;

    public static void main(String[] args) {

        int x = 0;
        Page65 ta[] = new Page65[4];
        while (x<4){
            ta[x] = new Page65();
            ta[x].height = (x+1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("Triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x++;
        }
        int y = x;
        x=27;
        Page65 t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y= " + y);
        System.out.println(", t5 area = " + t5.area);
    }
    void setArea(){
        area = (length*height) / 2;
    }
}
