import java.util.Scanner;

public class IT24102465Lab5Q3
{
	public static void main(String args[])
	{
		int NoDaysReserved;
		int StartDate;
		int EndDate;
		double totalamount=0;
		double Roomcharge=48000.0;
		int Discount10=10;
		int Discount20=20;
		
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Start date(1-31): ");
		StartDate=input.nextInt();
		
		System.out.print("Enter End date(1-31): ");
		EndDate=input.nextInt();
		
		if (StartDate>EndDate)
		{
			System.out.print("Error: Start Date must be less than End Date");
			return;
		}
		if (StartDate<1||EndDate<1|| StartDate>31||EndDate>31)
		{
			System.out.print("Error: Days must be between 1 and 31");
			return;
		}
		System.out.println();
		System.out.println("Room Charge Per Day: Rs."+Roomcharge+"/=");
		NoDaysReserved=EndDate-StartDate;
		System.out.println("Number of Days Reserved: "+NoDaysReserved);
		
		if (NoDaysReserved<3)
		{
		totalamount=NoDaysReserved*Roomcharge;
		
		}
		else if(NoDaysReserved>=3 || NoDaysReserved<=4)
		{
		totalamount=NoDaysReserved*Roomcharge-NoDaysReserved*Roomcharge*Discount10/100;		 
		}			
                else
		{
		totalamount=NoDaysReserved*Roomcharge-NoDaysReserved*Roomcharge*Discount20/100;		
		}
		System.out.print("Total amount to be paid: "+totalamount);
		System.out.println();
		input.close();
	}
}
