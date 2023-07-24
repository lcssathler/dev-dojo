package maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Minas Gerais, ' dd 'de' MMMM 'de' YYYY";
        String pattern2 = "'São' k':'m'h'";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);

        System.out.println(sdf.format(new Date()));
        System.out.println(sdf2.format(new Date()));
    }
}
