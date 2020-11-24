
package patternmethods;

import java.util.regex.*;
import java.util.*;

public class PatternMethods 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired pattern : ");
        String pattern = input.nextLine();
        System.out.print("Enter the text : ");
        String matcher = input.nextLine();
        Pattern myPattern2 = Pattern.compile(pattern);
        Matcher myMatcher2 = myPattern2.matcher(matcher);
        Boolean myBoolean2 = myMatcher2.matches();
        boolean b = myBoolean2;
        if(b==true)
        {
            System.out.println("I found the text : "+myMatcher2.group()+"/n"+"Starting at : "+myMatcher2.start()+"/n"+"Ending index at : "+myMatcher2.end());
        }
        else if(b==false)
        {
            System.out.println("No match found");
        }
    }
}
