import java.util.Scanner;
class vp
{
	public static void main (String aa[])
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter First Number");
	long A =obj.nextLong();
	System.out.println("Enter Second Number");
	long B =obj.nextLong();
	long C = A+B;

	System.out.println("total is = "+C);
	}
}