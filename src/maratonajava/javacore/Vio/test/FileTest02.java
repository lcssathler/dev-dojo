package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        //creating directory
        File directory = new File("folder");
        boolean isDirectoryCreated = directory.mkdir();
        System.out.println("Directory created?: " + isDirectoryCreated);

        //creating file
        File file = new File(directory,"text.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("File created?: " + isFileCreated);

        //renaming file inside directory
        if (file.exists()) {
            File renamedFile = new File(directory,"renamed_file.txt");
            boolean isRenamedFile = file.renameTo(renamedFile);
            System.out.println("File rename?: " + isRenamedFile);
        }

        //renaming directory
        if (directory.exists()) {
            File renamedDirectory = new File("renamedFolder");
            boolean isRenamedDirectory = directory.renameTo(renamedDirectory);
            System.out.println("Directory renamed?: " + isRenamedDirectory);
        }
    }
}
