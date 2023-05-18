package maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        final Path directory = Paths.get("/home/test");
        final Path file = Paths.get("/home/test/java/lucas/HelloWorld.txt");

        System.out.println(directory.relativize(file));
        System.out.println();

        final Path absolute1 = Paths.get("/home/lucas");
        final Path absolute2 = Paths.get("/user/local");
        final Path absolute3 = Paths.get("/home/lucas/maratonajava/test.txt");
        final Path relative1 = Paths.get("temp");
        final Path relative2 = Paths.get("temp/errorfile.png");

        System.out.println("1: " + absolute1.relativize(absolute3));
        System.out.println("2: " + absolute3.relativize(absolute1));
        System.out.println("3: " + absolute1.relativize(absolute2));
        System.out.println("4: " + relative1.relativize(relative2));
        System.out.println("5: " + absolute1.relativize(relative1));


    }

}
