package maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 127;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'P';
        boolean booleanP = false;

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = true;

        Integer newInt = 1; // this is a autoboxing
        Integer newInt1 = intP; //this is another autoboxing

        int newInt2 = Integer.valueOf(2); //this is a boxing
        int newInt3 = intW; //this is another boxing

        final char c = Character.toUpperCase('a');
        System.out.println(c);


    }
}
