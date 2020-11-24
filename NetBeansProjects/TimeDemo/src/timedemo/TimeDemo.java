
package timedemo;

import java.text.DateFormat;
import java.util.*;

public class TimeDemo 
{
    public static void main(String[] args) 
    {
       DateFormat df = new DateFormat.getTimeInstance(DateFormat.LONG, new Locale("de","DE"));
       String Time = df.format(new Date());
       System.out.println(Time);
    }
}
