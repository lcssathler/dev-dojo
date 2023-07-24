package maratonajava.javacore.TresourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("message",
                new Locale("pt", "BR"));

        System.out.println(bundle.getString("sayHello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("goodbye"));
    }
}
