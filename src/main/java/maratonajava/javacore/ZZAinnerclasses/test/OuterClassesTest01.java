package maratonajava.javacore.ZZAinnerclasses.test;

public class OuterClassesTest01 {
    private String name = "Lucas Sathler";

    class Inner {
        public void printOuterClassAttributes() {
            System.out.println(name);
            System.out.println(this.getClass());
            System.out.println(super.getClass());
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner1 = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner1.printOuterClassAttributes();
        inner2.printOuterClassAttributes();
    }
}
