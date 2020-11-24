import java.util.Scanner;
class array1
{
	public static void main(String aa[])
	{
	int n,i;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array ::: ");
	n = sc.nextInt();

	int a[] = new int [n];
		for(i=0; i<n; i++)
		{
			System.out.print("Enter element at a [ "+i+" ] index ::: ");
			a[i] = sc.nextInt();
		}
	System.out.println("\nElements are ::: \n");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
}