
package currencydemo;

import java.text.*;
import java.util.*;

public class CurrencyDemo 
{
    public static void main(String[] args) 
    {
        NumberFormat nft = new NumberFormat.getCurrencyInstance(new Locale("de","DE"));
        String formatted = nft.format(100000);
        System.out.println(formatted);
    }
}
