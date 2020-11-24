
package innerclass;

public class InnerClass
{
    private int a = 10;
    public static void main(String[] args)
    {
        InnerClass obj = new InnerClass();
        InnerClass.hello obj1 = new InnerClass.hello();
        obj1.display();
      // obj.a=10;

        obj1.name1();
        int b = 12;
        short a = (short)b;

        String c = "1234";
        float z = Float.parseFloat(c);
        System.out.println(z);

    class hello1
    {
        public void name()
        {
            System.out.println("helooooo");
        }
    }
    hello1 obj2 = new hello1();
    obj2.name();
    }
    
    class h extends InnerClass
    {
        public void display()
        {}
    }

    static class hello
    {
        public void display()
        {
            System.out.println("display");
        }

    public void name1()
        {
            System.out.println("welcome");
        }
    }
}