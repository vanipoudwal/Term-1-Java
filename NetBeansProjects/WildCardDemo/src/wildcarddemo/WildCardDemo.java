
package wildcarddemo;

public class WildCardDemo<T>
{
    private T t;
    
    public void setValue(T t)
    {
        this.t = t;
    }
    public T getValue()
    {
        return t;
    }
    public boolean compare(WildCardDemo<? extends Number> wcd)
    {
        if(t == wcd.t)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String[] args) 
    {
        WildCardDemo<Integer> obj1 = new WildCardDemo<Integer>();
        obj1.setValue(10);
        WildCardDemo<String> obj2 = new WildCardDemo<String>();
        obj2.setValue("test");
        System.out.println("Value of first object :: "+obj1.getValue());
        System.out.println("Value of second object :: "+obj2.getValue());
        System.out.println("Are both equal ?? "+ obj1.compare(obj2));
        //compilation error
    }
}