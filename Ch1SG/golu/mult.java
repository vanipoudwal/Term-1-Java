import java.util.Scanner;
class mult
{
	public int mult(int a,int b)
	{
		int c = a*b;
		return c;
	}
	public static void main(String aa[])
	{
		mult o = new mult();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = s.nextInt();
		System.out.println("Enter second number");
		int b = s.nextInt();
		System.out.println("Result = "o.mult(a,b));
	}
}