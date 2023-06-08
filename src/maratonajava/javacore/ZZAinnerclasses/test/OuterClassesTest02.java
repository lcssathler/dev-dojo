package maratonajava.javacore.ZZAinnerclasses.test;

public class OuterClassesTest02 {
    private String name = "George";

    void print() {
        class LocalClass {
            private String lastName = "Washington";
            void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }

        LocalClass local = new LocalClass();
        local.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
