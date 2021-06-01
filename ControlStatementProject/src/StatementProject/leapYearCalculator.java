package StatementProject;

import java.util.Scanner;

public class leapYearCalculator 
{
	public static void main(String[]args)
	{
		title();
		input();
	}
	public static void title()
	{
		System.out.println("\t\tProgram Leap Year Calculator\n\t\tBy Reyhan Afrizal 1197050114\n");
	}
	public static void input()
	{
		try (Scanner baca = new Scanner (System.in)) 
		{
			int month, year, date;
			String name=null;
			
			System.out.print("Enter input month (1-12) = ");
			month=baca.nextInt();
			
			System.out.print("Enter input year = ");
			year=baca.nextInt();
			
			System.out.println("\nResult :");
			String evenodd = (month%2==0) ? "Even" : "Odd";
			
			switch (month)
			{
				case 1 :
					name="Januari";
					date=31;
					break;
				case 2 :
					name="Februari";
					date=28;
					break;
				case 3 :
					name="Maret";
					date=31;
					break;
				case 4 :
					name="April";
					date=30;
					break;
				case 5 :
					name="Mei";
					date=31;
					break;
				case 6 :
					name="Juni";
					date=31;
					break;
				case 7 :
					name="Juli";
					date=30;
					break;
				case 8 :
					name="Agustus";
					date=31;
					break;
				case 9 :
					name="September";
					date=30;
					break;
				case 10 :
					name="Oktober";
					date=31;
					break;
				case 11 :
					name="November";
					date=30;
					break;
				case 12 :
					name="Desember";
					date=31;
					break;
				default :
					date=0;
					System.out.println("Invalid Input Month Was Detected");
					break;
			}
			
			if ((year%4==0&&year%100!=0)||year%400==0)
			{
				System.out.println("This is a Leap Year");
				if (date==28)
				{
					date=29;
				}
			}
			else
			{
				System.out.println("This is not a Leap Year");
			}
			
			System.out.println("The number month is "+evenodd);
			System.out.println("The Month is "+name+" has "+ date+" days");
		}
	}
	
}
