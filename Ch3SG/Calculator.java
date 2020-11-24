import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int a = reader.nextInt();
	System.out.println("Enter second number: ");
	int b = reader.nextInt();

	System.out.println("Press + for addition..");
	System.out.println("Press - for subtract..");
	System.out.println("Press * for multiply..");
	System.out.println("Press / for divide..");
	System.out.println("Press % for remainder..\n");
	System.out.println("Choose the option (+, -, *, /,%): ");
	char operator = reader.next().charAt(0);

	int result;

	switch(operator)
	{
	case '+':
		result = a + b;
		break;

	case '-':
		result = a - b;
		break;

	case '*':
		result = a * b;
		break;

	case '/':
		result = a / b;
		break;

	case '%':
		result = a % b;
		break;

	default:
		System.out.println("Error!! Operator is not correct..");
		return;
	}
		System.out.println("The result is = "+result);
	}
}