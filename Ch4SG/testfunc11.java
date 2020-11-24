import java.util.Scanner;
class testfunc11
{
	static void sum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Result = "+(a+b));
	}

	public static void main(String args[])
	{
		testfunc11.sum();
		testfunc11.sum();
		testfunc11.sum();
	}
}