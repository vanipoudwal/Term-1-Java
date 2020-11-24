import java.util.Scanner;
class my
{
	public static void main (String aa[])
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Your Name");
	String name=obj.next();
	System.out.println("Enter Your Number");
	long number=obj.nextLong();

	System.out.println("My name is ="+name);
	System.out.println("My phone number is ="+number);
	}
}