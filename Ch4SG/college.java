import java.util.Scanner;
class college
{
	public static void main(String aa[])
	{
	int option=1;
	int phno;
	String uname, pwd, cname, parents, gender, address, email;

	System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
	System.out.println(".=.=.=.=.=.=.=.=.UNIVERSITY OF DELHI.=.=.=.=.=.=.=.=.");
	System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");

	String username = "vani";
	String password = "niit";
	Scanner obj = new Scanner(System.in);

	System.out.print("\nEnter your username : ");
	uname = obj.next();
	System.out.print("Enter your password : ");
	pwd = obj.next();

		if(username.equals(uname) && password.equals(pwd))
		{
			System.out.println("\n.=.=.=.=.=.=.=.=.Delhi university welcomes you.=.=.=.=.=.=.=.=.");
		}
		else
		{
			System.out.println("\n.=.=.=.=.=.=.=.=.Invalid username & password.=.=.=.=.=.=.=.=.");
			System.exit(0);
		}

	switch(option)
	{
	case 1: 
		System.out.println("\nPress 1 for pre application form..");

	case 2:
		System.out.println("Press 2 for registeration..");

	case 3:
		System.out.println("Press 3 for fee structure..");

		System.out.println("\nChoose the option : ");
		option = obj.nextInt();
		break;

	default:
		System.out.println("Invalid Option..");
		break;
	}

		if(option==1)
		{
			System.out.print("\nEnter your name : ");
			cname = obj.next();
			System.out.print("Enter your parents name : ");
			parents = obj.next();
			System.out.print("Check in gender : ");
			gender = obj.next();
			System.out.print("Enter your phone number : ");
			phno = obj.nextInt();
			System.out.print("Enter your address : ");
			address = obj.next();
			System.out.print("Enter your email : ");
			email = obj.next();
		}
		else
		{
			System.out.println("yo...!!!");
		}
	}
}