import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Java\\Java-BackEnd\\Idea\\src\\newFile.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("This is my first file");
        fileWriter.close();
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());




    }
}
