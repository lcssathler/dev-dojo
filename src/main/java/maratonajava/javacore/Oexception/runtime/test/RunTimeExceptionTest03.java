package maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        System.out.println(openConection());
    }

    private static String openConection() {
        try {
            System.out.println("Opening file");
            System.out.println("Writing data in the file");
            throw new RuntimeException("Ops... We've got a problem.");
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Closing resources from OS");
        }
        return "Fix that shiit!";
    }
}
