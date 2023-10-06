package md.tekwillacademy.filemanagementservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class OutputFileWriterManager {

    public static void writeInformationIntoAFileUsingFileWriter(String filePath, String content){
        FileWriter fileWriterObject = null; // obiect de tipul FileWriter
        try {
            fileWriterObject = new FileWriter(filePath);
            fileWriterObject.write(content); // scrierea continutului

        } catch (IOException exceptionObject) {
            System.out.println("There is a problrm with the data writing process, let's skip this code");
            exceptionObject.printStackTrace();
        } finally {
            if (fileWriterObject != null){ // daca nu este null, procesul se inchide
                try {
                    fileWriterObject.close();
                } catch (IOException e){
                    throw  new RuntimeException();
                }
            }
        }
    }

    public static void writeInformationIntoAFileByUsingBufferedWriter(File file, String content){
        BufferedWriter bufferedWriterObject = null;
        try {
            bufferedWriterObject = new BufferedWriter(new FileWriter(file)); // definirea object
            bufferedWriterObject.write(content);
        } catch (IOException exceptionObject) {
            System.out.println(exceptionObject.getMessage());
        } finally {
            if (bufferedWriterObject != null) {
                try {
                    bufferedWriterObject.close();
                } catch (IOException e){
                    System.out.println("There is a problem when it comes to close the Writing Process");
                }
            }
        }


    }



}
