import java.util.Scanner;
class testfunc12
{
	static void mult()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Result = "+(a*b));
	}

	public static void main(String args[])
	{
		testfunc12.mult();
		testfunc12.mult();
		testfunc12.mult();
	}
}