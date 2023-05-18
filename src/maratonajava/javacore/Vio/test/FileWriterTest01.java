package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try(FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("\nHey, what's up! I'm Lucas\nand I'm learning Java.");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
