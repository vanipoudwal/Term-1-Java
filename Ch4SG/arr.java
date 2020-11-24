import java.util.Scanner;
class arr
{
	public static void main(String aa[])
	{
	Scanner s = new Scanner(System.in);

		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
		System.out.println("Enter the value: ");
		a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	}
}