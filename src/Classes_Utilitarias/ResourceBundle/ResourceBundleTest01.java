package src.Classes_Utilitarias.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("src.Classes_Utilitarias.ResourceBundle.messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));

    }
}
