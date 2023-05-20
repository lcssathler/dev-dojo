package maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.util.Set;

public class PosixFileAttributeTest01 {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("/home/lucas/dev");
        final PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posixFileAttributes.permissions());

        final PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        final Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw-");
        fileAttributeView.setPermissions(posixFilePermissions);
        System.out.println(fileAttributeView.readAttributes().permissions());
    }
}
