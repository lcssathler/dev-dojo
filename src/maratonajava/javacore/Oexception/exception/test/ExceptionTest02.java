package maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        createNewFile();
        System.out.println("This line will be executed.");
    }

    public static void createNewFile() throws IOException{
        File file = new File("file\\test.txt");
        try {
            final boolean isCreated = file.createNewFile();
            if (isCreated) {
                System.out.println("File created sucessfully: " + isCreated);
            } else {
                System.out.println("The file already exists");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

