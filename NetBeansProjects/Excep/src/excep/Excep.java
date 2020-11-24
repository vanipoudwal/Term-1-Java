
package excep;

import java.util.Scanner;

public class Excep
{
    public static void main(String[] args)
    {
        
        try
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your mobile no. : ");
            int a = s.nextInt();
            System.out.println("Mobile no. is : "+a);
        }
        
        catch(Exception e)
        {
            System.out.println("Invalid mobile no.");
        }
        
        finally
        {
            System.out.println("finally called...");
        }
    }
}
