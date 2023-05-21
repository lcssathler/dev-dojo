package maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaClassFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
        String glob = "glob:*{Test*}.{java,class}";
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        boolean matches = matcher.matches(path.getFileName());
        if (matches) {
            System.out.println(path.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");

        Files.walkFileTree(root, new ListJavaClassFiles());
    }
}
