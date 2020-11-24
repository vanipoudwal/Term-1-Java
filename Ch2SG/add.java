import java.util.Scanner;
class add
{
	public int sum (int a,int b)
	{
	int c = a+b;
	return c;
	}
	public static void main (String aa[])
	{
	add o = new add();
	Scanner s = new Scanner (System.in);
	System.out.println("Enter first number");
	int a = s.nextInt();
	System.out.println("Enter second number");
	int b = s.nextInt();
	System.out.println(o.sum(a,b));
	}
}