package JavaPDF.src.PDF.Unit3;

public class Page63A {

    public static void main(String[] args) {

        Books[] myBook = new Books[3];
        myBook[0] = new Books();
        myBook[1] = new Books();
        myBook[2] = new Books();
        myBook[0].author = "The Grapes of Java";
        myBook[1].author = "The Java Gatsby";
        myBook[2].author = "The Java CookBook";
        myBook[0].title = "bob";
        myBook[1].title = "sue";
        myBook[2].title = "ian";
        int x = 0;

        while (x < 3) {
            System.out.print(myBook[x].author);
            System.out.print(" by ");
            System.out.println(myBook[x].title);
            x = x + 1;
        }
    }
}

class Books{
    String title;
    String author;
}