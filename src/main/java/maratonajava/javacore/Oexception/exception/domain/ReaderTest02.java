package maratonajava.javacore.Oexception.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class ReaderTest02 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing ReaderTest02");
    }
}
