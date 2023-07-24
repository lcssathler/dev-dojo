package maratonajava.javacore.Wnio.test;

import java.nio.file.*;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.FileSystems;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/arquivo.txt");
        Path path2 = Paths.get("folder/subfolder/file.png");
        Path path3 = Paths.get("folder/subfolder/file.java");

        matchesPattern(path1, "glob:**/*.{txt,png,txt}");
        matchesPattern(path2, "glob:**/*.{txt,png,txt}");
        matchesPattern(path3, "glob:**/*.{txt,png,txt}");
    }

    public static void matchesPattern(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
