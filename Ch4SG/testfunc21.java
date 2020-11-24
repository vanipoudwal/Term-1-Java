import java.util.Scanner;
class testfunc21
{
	static void sum(int a, int b)
	{
		System.out.println("Result = "+(a+b));
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		testfunc21.sum(a,b);
	}
}