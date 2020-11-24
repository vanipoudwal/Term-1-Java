import java.util.Scanner;
class Divisible
{
public static void main(String[] args)
	{
	int num1, num2, result;
	Scanner obj = new Scanner(System.in);

	System.out.println("Enter First Number");
	num1 = obj.nextInt();
	System.out.println("Enter second Number");
	num2 = obj.nextInt();

	if (num2 == 0)
		{
		System.out.println("You cannot divide by 0");
		}
	else
		{
		result = num1 % num2;

		if (result == 0)
			{
			System.out.println("Divisible");
			}
		else
			{
			System.out.println("Not DIvisible");
			}

		}
	}
}