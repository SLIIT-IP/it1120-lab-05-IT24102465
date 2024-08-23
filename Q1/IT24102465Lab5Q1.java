import java.util.Scanner;

public class IT24102465Lab5Q1
{
	
	public static void main(String args[])
	{
		
		int no1,no2,no3;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the frist integer: ");
		no1=input.nextInt();
		
		System.out.print("Enter the Second integer: ");
		no2=input.nextInt();
		
		System.out.print("Enter the Third integer: ");
		no3=input.nextInt();
		
		System.out.println();
		
		System.out.println("User entered numbers are: "+no1+" "+no2+" "+no3);
		
		int smallestno=no1;
		int largestno=no1;
		
		if (no2>largestno)
		{
		
		largestno=no2;
		
		}
		else if (no3>largestno)
		{
		largestno=no3;	
	    }
		
		if (no2<smallestno)
		{
		smallestno=no2;
		}
		else if (no3<smallestno)
		{
			smallestno=no3;
		}
		
		
		System.out.println("The smallest number is: "+smallestno);
		System.out.println("The Largest number is: "+largestno);
		
		input.close();
	}
	    
	
	
	
	
	
	
	
}