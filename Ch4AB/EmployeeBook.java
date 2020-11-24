import java.util.Scanner;
public class EmployeeBook
{
	Long empid, doj, dob, dom;
	String empname, desgn, dept, ms, crt;
	Scanner s = new Scanner(System.in);

	public void showMenu()
	{
		int option;
		Scanner s = new Scanner(System.in);
		System.out.println("---------Menu---------");
		System.out.println("1. Enter Data");
		System.out.println("2. Display Data");
		System.out.println("3. Exit");
		System.out.println("\nChoose the option:  ");
		option = s.nextInt();
		
		switch (option)
		{
		case 1: EnterData();
			break;
		case 2: DisplayData();
			break;
		case 3: ExitMenu();
			break;
		default: System.out.println("Incorrect menu option");
			break;
		}
	}

	public void EnterData()
	{
		System.out.println("Enter the Employee ID");
			empid = s.nextLong();
		System.out.println("Enter the Employee Name");
			empname = s.next();
		System.out.println("Enter the Department");
			dept = s.next();
		System.out.println("Enter the Designation");
			desgn = s.next();
		System.out.println("Enter the Date of Joining");
			doj = s.nextLong();
		System.out.println("Enter the Date of Birth");
			dob = s.nextLong();
		System.out.println("Enter the Marital Status");
			ms = s.next();
		System.out.println("Enter the Date of Marriage");
			dom = s.nextLong();

		System.out.println("------------------------");
		System.out.println("Employee ID is = " +empid);
		System.out.println("Employee Name is = " +empname);
		System.out.println("Department is = " +dept);
		System.out.println("Designation is = " +desgn);
		System.out.println("Date of Joining is = " +doj);
		System.out.println("Date of Birth is = " +dob);
		System.out.println("Marital Status is = " +ms);
		System.out.println("Date of Marriage is = " +dom);
		System.out.println("------------------------");
	}

	public void DisplayData()
	{
		System.out.println("------------------------");
		System.out.println("Is your employee id correct.?");
			crt = s.next();
		System.out.println("------------------------");

		System.out.println("Employee ID is : " +crt);
	}

	public void ExitMenu()
	{
		System.exit(0);
	}

	public static void main (String[] args)
	{
		EmployeeBook obj = new EmployeeBook();
		obj.showMenu();
	}
}