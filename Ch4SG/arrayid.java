import java.util.Scanner;
class arrayid
{
	public static void main(String [] args)
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :: ");
		n = sc.nextInt();

		int ar[] = new int[n];
			for(i=0;i<n;i++)
			{
				System.out.println("Enter the elements at a ["+i+"] index");
				ar[i] = sc.nextInt();
			}
		System.out.println("\nElements are :: \n");
			for(i=0;i<n;i++)
			{
				System.out.println(ar[i]+"\t");
			}
		System.out.println("Searching of elements");
		System.out.println("Enter any element :: ");
		n = sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(ar[i]==n)
			{
				System.out.println("Element is found at "+i+" position");
			}
			else
			{
				System.out.println("Value not found");
			}
		}
	}
}