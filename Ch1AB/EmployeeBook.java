import java.util.Scanner;
public class EmployeeBook
{
	public static void main (String [] args)
	{
	Long empid, doj, dob, dom;
	String empname, desgn, dept, ms;
	Scanner s = new Scanner(System.in);

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
}