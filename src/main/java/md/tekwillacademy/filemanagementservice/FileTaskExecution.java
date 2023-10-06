package md.tekwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileTaskExecution {
    public static void main(String[] args) throws IOException {
        File fileObject = new File("src/main/java/md/tekwillacademy/filemanagementservice/test.txt");
        System.out.println(FileManager.createTheFileIfItDoesNotExist(fileObject)); // se creaza fisierul
        FileManager.informationIfTheFileExists(fileObject); // se verifica daca fisierul exista
        FileManager.printTheFileName(fileObject);
        FileManager.printTheAbsolutePath(fileObject);
        FileManager.printIfIsADirectoryOrAFile(fileObject);


        OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(), "Content");
        OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(), "Altceva"); // Content se sterge
        OutputFileWriterManager.writeInformationIntoAFileByUsingBufferedWriter(fileObject, "Value Free");
        OutputFileWriterManager.writeInformationIntoAFileByUsingBufferedWriter(fileObject, "Value Free Two");

        InputFileReaderManager.printDataOnTheConsoleUsingFileReader(fileObject);
        System.out.println();
        InputFileReaderManager.printDataFromAFileUsingBufferedReader(fileObject);
        InputFileReaderManager.printDataUsingTheEasiestWay(fileObject);
    }
}
