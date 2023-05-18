package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

        /*
        * \d - all digits
        * \D - excluding digits
        * \s - all spaces (\n, \f, \r, \t)
        * \S - excluding spaces
        * \w - all characters (a-z, A-Z, digits and _ )
        * \W - all special characters, excluding \w
        * [] - range
        */

        String regex = "0[xX][0-9a-fA-F]";
        String text = "12 0x 0xFFF 0X 0X1 0x43ff 0x";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text:   " + text);
        System.out.println("Index:  0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Indexes found: ");

        while (matcher.find()) {
            System.out.print(matcher.start() + " - " + matcher.group() + "\n");
        }
    }
}
