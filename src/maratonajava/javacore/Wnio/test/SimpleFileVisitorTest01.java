package maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        //System.out.println(file.getFileName());
        String regex = "([a-zA-Z0-9])+.java";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(file.getFileName().toString());

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
