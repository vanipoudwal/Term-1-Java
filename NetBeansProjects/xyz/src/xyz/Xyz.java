
package xyz;

public class Xyz extends well
{
    
    public static void main(String[] args)
    {
        System.out.println("hello world");
        Xyz obj = new Xyz();
        obj.display();
        obj.a=12;
        obj.meth();
    }
    
        @Override
    public void display()
    {
       super.display();
       System.out.println("O yeah");
    }
}