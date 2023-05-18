package maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path directory = Paths.get("home/lucas");
        Path file = Paths.get("dev/file.txt");

        System.out.println(directory.resolve(file));
        System.out.println();

        final Path absolute = Paths.get("/home/lucas");
        final Path relative = Paths.get("dev");
        final Path file2 = Paths.get("file.txt");

        System.out.println("Absolute: " + absolute);
        System.out.println("Relative: " + relative);
        System.out.println("File2: " + file2);
        System.out.println();
        System.out.println("1: " + absolute.resolve(relative));
        System.out.println("2: " + absolute.resolve(file));
        System.out.println("3: " + relative.resolve(absolute)); //NOT RESOLVED
        System.out.println("4: " + relative.resolve(file2));
        System.out.println("5: " + file2.resolve(absolute)); //NOT RESOLVED
        System.out.println("6: " + file2.resolve(relative));

    }
}
