
package myabstr;

public class Myabstr extends myname
{

        String a;
    
    public void abc (String a)
    {
        this.a=a;
    }
    public static void main(String[] args)
    {
        
        myname ob = new Myabstr();
        Myabstr obj = new Myabstr();
        ob.nonabs();
        obj.abc("alok");
       // obj.nonabs();
    }
    
    @Override
    public void nonabs()
    {
        super.nonabs();
        System.out.println("welcome to java");
    }
}

  abstract class myname
{
    public void nonabs()       
    {
        System.out.println("welcome");
    }
}