package MentorLessons.Month4.Lesson17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter file name: ");
        String fileName = sc.next();
        File rootPath = new File("C:\\Java\\Java-BackEnd\\IngressAcademy");
        File file = new File(rootPath, fileName);

        try {
            if (file.exists()) {
                System.out.println("File is already exists!");
                File newFile = new File(rootPath, "_copy.txt");
                newFile.createNewFile();
                System.out.println("File copy is created!");
            } else {
                file.createNewFile();
                System.out.println("File created successfully!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

// io and nio package difference
// gc mark and swipe
//heap memory
// about all java memory
// gc minor major
