import java.util.Scanner;
class sub
{
	public int sub(int a,int b)
	{
		int c = a-b;
		return c;
	}
	public static void main(String aa[])
	{
		sub o = new sub();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = s.nextInt();
		System.out.println("Enter second number");
		int b = s.nextInt();
		System.out.println("Result = "o.sub(a,b));
	}
}