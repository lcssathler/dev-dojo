package maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().plusDays(10);
        File file1 = new File("folder_path/test.txt");
        boolean isFileCreated = file1.createNewFile();
        final boolean isModified = file1.setLastModified(date.toInstant(ZoneOffset.UTC)
                                    .toEpochMilli());

        final Path path = Paths.get("folder_path/newtest.txt");
        final Path file2 = Files.createFile(path);
        final FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        final Path pathModifiedTime = Files.setLastModifiedTime(path, fileTime);


    }
}
