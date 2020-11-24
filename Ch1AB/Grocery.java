class Grocery
{
	private int weight;
	String productName;
	double price;

	public Grocery()
	{
	weight = 4;
	productName = "Sugar";
	price = 6;
	}

	public void weightAdd()
	{
	weight +=5;
	}

	public void weightRemove()
	{
	weight -=3;
	}

	public void checkWeight()
	{
	System.out.println(+weight);
	}

	public static void main(String args[])
	{
	Grocery g = new Grocery();
	System.out.println("The current weight is ");
	g.checkWeight();

	System.out.println("The weight after addition is ");
	g.weightAdd();
	g.checkWeight();

	System.out.println("The weight after subtraction is ");
	g.weightRemove();
	g.checkWeight();
	}
}