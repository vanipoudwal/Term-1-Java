import java.util.Scanner;
class vani
{
public void check()
	{
	String username = "vani";
	String password = "niit";
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the username");
	String name = obj.next();
	System.out.println("Enter the password");
	String pwd = obj.next();

	if(username.equals(name) && password.equals(pwd))
	{
		System.out.println("Welcome to the new page!!!");
	}
	else
	{
		System.out.println("Invalid username & password!!!");
	}
	}

	public static void main(String aa[])
	{
	vani golu = new vani();
	golu.check();
	}
}