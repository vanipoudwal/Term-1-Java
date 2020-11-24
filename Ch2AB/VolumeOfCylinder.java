import java.util.Scanner;
public class VolumeOfCylinder
{
	public static void main (String [] args)
	{
	int r, h;
	double Volume;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the radius");
	r = s.nextInt();
	System.out.println("Enter the height");
	h = s.nextInt();
	Volume = 3.14 * r * r * h;
	System.out.println("------------------------");
	System.out.println("Volume =" +Volume);
	System.out.println("------------------------");
	}
}