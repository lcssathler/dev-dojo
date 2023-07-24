package maratonajava.javacore.ZZAinnerclasses.test;

public class OuterClassesTest03 {
    private String name = "Lucas";
    static class Nested {
        private String lastName = "Sathler";
        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
