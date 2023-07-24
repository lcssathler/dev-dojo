package maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/subfolder/subsubfolder/file.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime creationTime = basicFileAttributes.creationTime();

        System.out.println("creationTime: " + creationTime);
        System.out.println("lastModifiedTime: " + lastModifiedTime);
        System.out.println("lastAccessTime: " + lastAccessTime);
        System.out.println("=-".repeat(25));

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newLastAccessTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime,newLastAccessTime, creationTime);

        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        creationTime = fileAttributeView.readAttributes().creationTime();

        System.out.println("creationTimeView: " + creationTime);
        System.out.println("lastModifiedTimeView: " + lastModifiedTime);
        System.out.println("lastAccessTimeView: " + lastAccessTime);
    }
}
