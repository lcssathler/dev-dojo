package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        //File fileAbsolutePath = new File("D:\\documentos-estudo-programacao\\Java\\DevDojo\\file");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Was the file created?: " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is hidden: " + file.isHidden());
            System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified())
                                .atZone(ZoneId.systemDefault()));
            if (file.exists()) {
                System.out.println("Was the file deleted?: " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
