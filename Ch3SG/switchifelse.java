import java.util.Scanner;
class switchifelse
{
	public void display(int x1, int a1, int b1, String uname, String pwd)
	{
	String username = "vani";
	String password = "niit";

	if(uname.equals(username) && pwd.equals(password))
	{
		System.out.println("Welcome to the calculator!!!");
	}
	else
	{
		System.out.println("Invalid username & password!!!");
	}

		switch(x1)
		{
		case 1: x1 = a1+b1;
			System.out.println("Total is = "+x1);
			break;

		case 2: x1 = a1-b1;
			System.out.println("Total is = "+x1);
			break;

		case 3: x1 = a1*b1;
			System.out.println("Total is = "+x1);
			break;

		case 4: x1 = a1/b1;
			System.out.println("Total is = "+x1);
			break;

		default:
			System.out.println("No. is invalid");
			break;
		}
	}

	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("----------login----------");
		System.out.println("Enter the username");
		String u = obj.next();
		System.out.println("Enter the password");
		String p = obj.next();

		System.out.println("----------welcome----------");
		System.out.println("Enter the first no.");
		int a1 = obj.nextInt();
		System.out.println("Enter the second no.");
		int b1 = obj.nextInt();

		System.out.println("Press 1 for add");
		System.out.println("Press 2 for sub");
		System.out.println("Press 3 for mult");
		System.out.println("Press 4 for divide");
		System.out.println("Enter your  choice : ");
		int x1 = obj.nextInt();

		switchifelse obj1 = new switchifelse();
		obj1.display(x1,a1,b1,u,p);
	}
}