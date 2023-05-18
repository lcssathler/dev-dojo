package maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String directory = "home/lucas/dev";
        String fileTxt = "../../lucasdev.txt";
        Path path1 = Paths.get(directory, fileTxt);
        System.out.println(path1.normalize());

        StringBuilder sb = new StringBuilder(directory);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        directory = sb.toString();
        System.out.println(directory);
    }

}
