import java.util.Scanner;
class Hangman;
{
	public static void main(String aa[])
	int i = 1, flag = 0;
	String input, guess;
	Scanner s = new Scanner(System.in);
	do
	{
	System.out.print("/nEnter your guess: ");
	input = s.next();

	for(i=0;i<word.length();i++)
	{
		if(word.charAt(i) == input.charAt(0))
		{
			flag = 1;
		}
	}
		if(flag == 1)
		{
			System.out.println("This letter is present in the word..");
		}
		else
		{
			System.out.println("This letter is not present in the word..");
		}

	System.out.println("Do you want to guess again (y/n): ");
	guess = s.next();
	flag = 0;

	} while(guess.equals("y") || guess.equals("Y"));
}