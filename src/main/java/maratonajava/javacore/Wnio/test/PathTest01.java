package maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        final Path p1 = Paths.get("D:\\documentos-estudo-programacao\\Java\\DevDojo\\text.txt");
        final Path p2 = Paths.get("D:\\documentos-estudo-programacao\\Java\\DevDojo", "text.txt");
        final Path p3 = Paths.get("D:", "documentos-estudo-programacao\\Java\\DevDojo\\text.txt");
        final Path p4 = Paths.get("D:", "documentos-estudo-programacao", "Java", "DevDojo", "text.txt");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
