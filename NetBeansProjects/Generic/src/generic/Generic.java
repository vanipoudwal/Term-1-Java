//upwork.com
package generic;

public class Generic<T>
{
        T t;
        
    public void setT(T t)
        {
            this.t = t;
        }
    
    public static void main(String[] args)
        {
            Generic obj = new Generic();
            obj.setT(12);
            System.out.println(obj.t);
        }
}
