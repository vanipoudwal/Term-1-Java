
package stone;

    public class Stone extends Abc
{
    private int a;
    public void check()
	{
	super.check();
	System.out.println("qwerty");
	}
    public static void main(String [] args)
	{
	System.out.println("hello world");
	Stone obj = new Stone();
	obj.check():
	obj.a=10;
	obj.meth();
	}

    private void meth()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}