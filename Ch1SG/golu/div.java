import java.util.Scanner;
class div
{
	public int div(int a,int b)
	{
		int c = a/b;
		return c;
	}
	public static void main(String aa[])
	{
		div o = new div();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = s.nextInt();
		System.out.println("Enter second number");
		int b = s.nextInt();
		System.out.println(o.div(a,b));
	}
}