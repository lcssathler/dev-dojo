package maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        createNewFile();
    }

    public static void createNewFile() {
        File file = new File("file\\test.txt");
        try {
            final boolean isCreated = file.createNewFile();
            System.out.println("File created sucessfully: " + isCreated);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
