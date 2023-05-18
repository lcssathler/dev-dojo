package maratonajava.javacore.Oexception.exception.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Person  {
    public void save() throws InvalidLoginException, FileNotFoundException, IOException {
        System.out.println("Saving from Person Class");
    }
}
