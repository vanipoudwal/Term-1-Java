import java.util.Scanner;
public class Bank
{
	public static void main (String [] args)
	{
	Long accountno, phoneno;
	String customername, emailaddress;
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the customer name");
		customername = s.next();
	System.out.println("Enter the phone no");
		phoneno = s.nextLong();
	System.out.println("Enter the account no");
		accountno = s.nextLong();
	System.out.println("Enter the email address");
		emailaddress = s.next();

	System.out.println("------------------------");
	System.out.println("customer name is = " +customername);
	System.out.println("phone no is = " +phoneno);
	System.out.println("account no is = " +accountno);
	System.out.println("email address is = " +emailaddress);
	System.out.println("------------------------");
	}
}