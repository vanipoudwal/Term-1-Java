import java.util.Scanner;
class hotel
{
	public static void main(String aa[])
	{
	int option=1;
	int phno, idno, noroom;
	String uname, pwd, gname, gender, checkin, checkout, idtype, address, roomtype;

	System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
	System.out.println(".=.=.=.=.=.=.=.WELCOME TO THE TAJ HOTEL.=.=.=.=.=.=.=.");
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
		System.out.println("\n.=.=.=.=.=.=.=.Welcome to our hotel.=.=.=.=.=.=.=.");
	}
	else
	{
		System.out.println("\n.=.=.=.=.=.=.=.Invalid username & password.=.=.=.=.=.=.=.");
		System.exit(0);
	}

	switch(option)
	{
	case 1: 
		System.out.println("\nPress 1 for guest entry..");

	case 2:
		System.out.println("Press 2 for food..");

	case 3:
		System.out.println("Press 3 for laundry..");

	case 4:
		System.out.println("Press 4 for billing..");

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
		gname = obj.next();
		System.out.print("Enter your gender : ");
		gender = obj.next();
		System.out.print("Enter your phone number : ");
		phno = obj.nextInt();
		System.out.print("Check in date : ");
		checkin = obj.next();
		System.out.print("Check out date : ");
		checkout = obj.next();
		System.out.print("Enter your Id type : ");
		idtype = obj.next();
		System.out.print("Enter your Id number : ");
		idno = obj.nextInt();
		System.out.print("Enter your address : ");
		address = obj.next();
		System.out.print("Room type : ");
		roomtype = obj.next();
		System.out.print("No of rooms : ");
		noroom = obj.nextInt();
	}
	else
	{
		System.out.println("yo...!!!");
	}
	}
}