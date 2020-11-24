
package create;

import java.util.*;
public class Create 
{
    public static void main(String[] args) 
    {
        float age;
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter the age : ");
        age = obj1.nextFloat();
        if(age <= 0)
        {
            try
            {
                throw new Exception();
            }
            catch(Exception e)
            {
                System.out.println("Exception raised");
            }
        }
        else
        {
            System.out.println("Age entered is = "+age);
        }
    }
}
