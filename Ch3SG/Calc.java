import java.util.Scanner;
public class Calc
{
	public static void main(String args[])
	{
	int a, b, result;
	char choice, ch;
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter first num: ");
	a = scan.nextInt();
	System.out.println("Enter second num: ");
	b = scan.nextInt();

	System.out.println("Press 1 for add");
	System.out.println("Press 2 for sub");
	System.out.println("Press 3 for mult");
	System.out.println("Press 4 for div\n");
	System.out.println("Enter Your Choice: ");
	choice = scan.next().charAt(0);

	switch(choice)
	{
		case '1' :
			result = a + b;
			System.out.println("Result = " + result);
			break;

		case '2' :
			result = a - b;
			System.out.println("Result = " + result);
			break;

		case '3' :
			result = a * b;
			System.out.println("Result = " + result);
			break;

		case '4' :
			result = a / b;
			System.out.println("Result = " + result);
			break;

		default : System.out.println("Wrong Choice!!!");
			break;
	}

	System.out.println("\n---------------------------------------\n");
	}
}