import java.util.Scanner;
class testfunc31
{
	static int sum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		return c;
	}

	public static void main(String args[])
	{
		int x = testfunc31.sum();
		System.out.println("Result = "+x);
	}
}