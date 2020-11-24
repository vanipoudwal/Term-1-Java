
package datedemo;

import java.text.DateFormat;
import java.util.*;
        
public class DateDemo
{
    public static void main(String[] args) 
    {
       DateFormat df = new DateFormat.getDateInstance(DateFormat.LONG, new Locale("de","DE"));
       String Date = df.format(new Date());
       System.out.println(Date);
    }
}
