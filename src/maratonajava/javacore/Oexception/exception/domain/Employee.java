package maratonajava.javacore.Oexception.exception.domain;

import java.io.IOException;

public class Employee extends Person{
    @Override
    public void save() throws InvalidLoginException, IOException{
        System.out.println("Saving from Employee Class");
    }
}
