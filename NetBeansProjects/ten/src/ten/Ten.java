
package ten;

import java.util.Scanner;

public class Ten extends zz
{
    public static void main(String[] args)
    {
        System.out.println("Enter a, b");
        Ten obj = new Ten();
        Scanner objj = new Scanner(System.in);
 
        int a = objj.nextInt();  
        int b = objj.nextInt();
        obj.sum(a,b);
        obj.display();
    }
   
      @Override
    public void sum(int a, int b)
    {
            super.a=a;
            super.b=b;
    }
    
    public int display()
    {
        super.c=a+b;
        System.out.println(c);
        return c;
    }
}