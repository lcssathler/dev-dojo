package maratonajava.javacore.Oexception.exception.test;

import maratonajava.javacore.Oexception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }

    private static void login() throws InvalidLoginException {
        Scanner input = new Scanner(System.in);
        String usernameDataBase = "lcssathler";
        String passwordDataBase = "lipedoido";

        System.out.print("Username: ");
        String typedLogin = input.nextLine();
        System.out.print("Password: ");
        String typedPassword = input.nextLine();

        if (!typedLogin.equals(usernameDataBase) || !typedPassword.equals(passwordDataBase)) {
            throw new InvalidLoginException("Invalid login and/or password!");
        }
        System.out.println("Login sucessfully.");
    }
}
