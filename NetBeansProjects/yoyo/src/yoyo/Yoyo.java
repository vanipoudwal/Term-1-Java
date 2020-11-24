
package yoyo;

public class Yoyo 
{
    int a;
    
    public static void main(String[] args) 
    {
        Yoyo obj = new Yoyo();
        //Yoyo obj1 = new Yoyo();
        obj.calculate();
        obj.calculate(10);
    }
    
    public void calculate()
    {
        System.out.println("qwaw");
    }
    
    public void calculate(int a)
    {
        System.out.println("abcd");
    }
}
