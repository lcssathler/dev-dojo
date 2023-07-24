package maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Inside IllegalArgumentException");
        }
        catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }

        try {
            maybeThrowsException();
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void maybeThrowsException () throws SQLException, FileNotFoundException {
        throw new SQLException();
    }
}
