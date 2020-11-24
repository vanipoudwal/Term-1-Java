
package testlocale;

import java.util.*;

public class TestLocale 
{
    public static void main(String[] args)
    {
        Locale l1 = new Locale("de","DE");
        ResourceBundle rb1 = new ResourceBundle.getBundle("MessageBundle",l1);
        System.out.println(rb1.getString("message"));
        Locale l2 = new Locale("zn","ZN");
        ResourceBundle rb2 = new ResourceBundle.getBundle("MessageBundle",l2);
        System.out.println(rb2.getString("message"));
    }
}
