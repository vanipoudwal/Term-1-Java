
package genrics;

import java.util.*;

public class Genrics <X,T>
{
    T t;
    X x;

    Genrics(X x,T t)
    {
        this.t=t;
        this.x=x;
    }

    private Genrics()
    {
        throw new UnsupportedOperationException("Not supported yet");
    }

        public<T> T setT(T t)
        {
            return t;
        }

    public static void main(String[] args)
    {
        Genrics obj = new Genrics();
        System.out.println(obj.setT("alok"));
        System.out.println(obj.setT("<>L1"));

        Genrics<String, Integer> obj1 = new Genrics("1",1);
        obj.setT(12);
        System.out.println(obj.t);

      // Genrics<String>obj1 = new Genrics();
        obj.setT("alok");
        System.out.println(obj.setT("alok"));
        System.out.println(obj.setT(98765));

        Set s = new TreeSet();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("e");
        s.clear();
        System.out.println(s);
        Iterator i = s.iterator();

        while(i.hasNext())
        {
            s.removeAll(s);
            System.out.println(i.next());
        }
    }
}
