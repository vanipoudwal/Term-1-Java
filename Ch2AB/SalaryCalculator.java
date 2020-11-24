//package calculator;
import java.util.Scanner;
public class SalaryCalculator
{
	public static void main (String arr[])
	{
	int hra;
	int specialallowance;
	int pf;
	int netpayablesalary;
	int basicsalary;

	System.out.println("Enter your basic salary: ");
	Scanner scl = new Scanner(System.in);
	basicsalary = scl.nextInt();

	hra = (50*basicsalary)/100;
	specialallowance = (75*basicsalary)/100;
	pf = (12*basicsalary)/100;
	netpayablesalary = basicsalary + hra + specialallowance - pf;

		System.out.println("Basic salary = "+basicsalary);
		System.out.println("HRA = "+hra);
		System.out.println("Special allowance = "+specialallowance);
		System.out.println("PF = "+pf);
		System.out.println("---------------------------------------");
		System.out.println("Net payable salary = "+netpayablesalary);
	}
}