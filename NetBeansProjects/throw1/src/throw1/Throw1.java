
package throw1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw1
{
    public void display()
    {
        try
        {
            throw new ArithmeticException();
        }
        catch(Exception e)
        {
            System.out.println("abcd");
        }
    }
    
    public static void main(String[] args) 
    {
        try
        {
            Throw1 obj = new Throw1();
            obj.display();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your mobile no.");
            int a = s.nextInt();
            System.out.println("My mobile no. is = "+a);
        }
        catch(ArithmeticException a)
        {
            System.out.println("Incorrect no.");     
            try
            {
                throw a;
            }
            catch(Exception e1)
            {
                System.out.println("098");
            }
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Error");
        }
        catch(InputMismatchException i)
        {
            System.out.println("Invalid");
        }
        finally
        {
            System.out.println("finally called");
        }
    }
}
