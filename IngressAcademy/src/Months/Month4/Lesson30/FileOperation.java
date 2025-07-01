package Months.Month4.Lesson30;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation();
        File file = new File("C:\\Users\\tofiq_0ds\\OneDrive\\Documents\\Oca40Files\\myOca40File.doc");
//        fileOperation.createFile(file);
//        fileOperation.renameFile(file, "myNewOcaFileName.xlsx");
        fileOperation.writeToFile(file, "Write this text to File");
//        fileOperation.move(file);
        double size = fileOperation.getSize(file);
        System.out.println(size );
        File copyFile = new File("C:\\Users\\tofiq_0ds\\OneDrive\\Documents\\Oca40Files\\moveFolder\\myCopyFile.xls");
        fileOperation.copyFile(file,copyFile);
        fileOperation.getFileExtention(file);

    }

    public void createFile(File file){
        try {
            if(!file.exists()){
                file.createNewFile();
                System.out.println("File successfully created");
            }else {
                System.err.println("File Already exist");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void renameFile(File file, String newName){
        file.renameTo(new File(file.getParent() + File.separator + newName));
    }

    public  void writeToFile(File file, String text){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))){
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.write(text.toCharArray());
            bufferedWriter.newLine();
            bufferedWriter.write("End Of document");
            System.out.println("The text " + text + "wrote");
        } catch (IOException e) {
            System.err.println("Cannot write to File");
        }
    }

    public void move(File file){
        File fileMove = new File(file.getParent() + File.separator + "moveFolder");
        fileMove.mkdir();
        System.out.println(fileMove.getAbsolutePath());
        if(file.renameTo(new File(fileMove + "\\" + "movedFile.txt"))){
            System.out.println("Success moved");
        }else{
            System.out.println("Move failed");
        }
    }
    public double getSize(File file){
        double byteSize = file.length();
        double Kbsize = byteSize/1024;
        return Kbsize;
    }

    public void copyFile(File file, File copyFile){
        try(FileInputStream inputStream = new FileInputStream(file);
            FileOutputStream outputStream = new FileOutputStream(copyFile)){
            int length;
            while ((length = inputStream.read()) != -1 ){
                outputStream.write(length);
            }
            System.out.println("The File copied");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getFileExtention(File file){
        if(file.exists() && file.getName().lastIndexOf('.') !=0 && file.getName().lastIndexOf('.') !=-1 && file.getName().lastIndexOf('.') != file.getName().length()-1)
            System.out.println(file.getName().substring(file.getName().lastIndexOf('.')+1));
    }
}
