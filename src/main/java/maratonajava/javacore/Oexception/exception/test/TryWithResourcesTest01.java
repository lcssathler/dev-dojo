package maratonajava.javacore.Oexception.exception.test;

import maratonajava.javacore.Oexception.exception.domain.ReaderTest02;
import maratonajava.javacore.Oexception.exception.domain.ReaderTest1;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try (ReaderTest1 reader1 = new ReaderTest1();
             ReaderTest02 reader2 = new ReaderTest02()) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
