package md.tekwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static boolean createTheFileIfItDoesNotExist(File file) throws IOException {
        return file.createNewFile(); // retutneaza un boolean
        // exceptie verificata - se subliniaza cu rosu
    }

    public static void informationIfTheFileExists(File file){
        if (file.exists()){
            System.out.println("The file is present");
        } else {
            System.out.println("The file is not present");
        }

    }

    public static void printTheFileName(File fileThatIsConsidered){
        System.out.println(fileThatIsConsidered.getName());
    }

    public static void printTheAbsolutePath(File fileThatIsConsidered){
        System.out.println(fileThatIsConsidered.getAbsolutePath());
    }

    public static void printIfIsADirectoryOrAFile(File file){
        if (file.isDirectory()){
            System.out.println("It is a directory");
        } else {
            System.out.println("Is is a file");
        }
    }

}
