public class Reservation
{
	int ticketID;
	String name;
	String source;
	String destination;

	Reservation ()
	{
	ticketID = 80;
	name ="Harry";
	source = "Chicago";
	destination = "Dallas";
	}

	public void showTicket ()
	{
	System.out.println("The Ticket ID is = "+ ticketID);
	System.out.println("The Passenger Name is = "+ name);
	System.out.println("The Source is = "+ source);
	System.out.println("The Destination is = "+ destination);
	System.out.println("\nChoose the option: ");
	}

	public static void main (String[] args)
	{
	Reservation g = new Reservation();
	g.showTicket();
	}
}