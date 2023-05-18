package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {

        /*
        * \d - all digits
        * \D - excluding digits
        * \s - all spaces (\n, \f, \r, \t)
        * \S - excluding spaces
        * \w - all characters (a-z, A-Z, digits and _ )
        * \W - all special characters, excluding \w
        *
        * [] - range
        *
        * ? - zero ou uma ocorrência;
        * * - zero ou mais ocorrências;
        * + - uma ou mais ocorrências;
        * {n,m}- de n ocorrências até m ocorrências;
        * () - agrupamento;
        * |- “ou”. Ex: o(v|c)o retornará ovo ou oco;
        * $ - fim da expressão;
        * . - caractere coringa, indicando que pode qualquer caractere pode substituí-lo. Ex 1.3 = 1@3, 123, 1A3, 1 3, 133, 113…
        */

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0xF3D 0x 0X 0x4A3G 0x1";
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
