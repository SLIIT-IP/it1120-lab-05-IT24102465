import java.util.Scanner;

public class IT24102465Lab5Q2
{
	public static void main(String args[])
	{
	int newmember;
	
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number of new members introduced: ");
	newmember=input.nextInt();
	System.out.println();
	
	if (newmember<0)
	{
		System.out.print("Input must be a number 0 or greater");
		System.out.println();
		return;
	}
	switch (newmember)
	{
		case 0:
		System.out.print("prize is a : No Prize");
		break;
		
		case 1:
		System.out.print("prize is a : Pen");
		break;
		
		case 2:
		System.out.print("prize is a : Umbrella");
		break;
		
		case 3:
		System.out.print("prize is a : Bag");
		break;
		
		case 4:
		System.out.print("prize is a : Travelling chair");
		break;
		
		default:
		System.out.print("prize is a : Headphone");
		
		
	}
	System.out.println();
	input.close();
	
	}
	
}