import java.util.Scanner;
public class Distance
{
	public static void main (String [] args)
	{
	int u, a, t, distance;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the initial velocity");
	u = s.nextInt();
	System.out.println("Enter the accelaration");
	a = s.nextInt();
	System.out.println("Enter the time");
	t = s.nextInt();
	distance = u*t+(a*t*t)/2;
	System.out.println("------------------------");
	System.out.println("Distence Travelled = "+distance+" meter");
	System.out.println("------------------------");
	}
}