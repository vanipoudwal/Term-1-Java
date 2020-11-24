class ff
{
	public static void main(String args[])
	{
	String Str1 = new String("princess guddu");
	char[] Str2 = new char[5];
	Str1.getChars(8, 10, Str2, 0);
	System.out.print("Value Copied = ");
	System.out.println(Str2);
	}
}