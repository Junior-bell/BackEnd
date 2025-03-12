package Prep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckIfLeapYear {
	Scanner sc = new Scanner(System.in);

	public void LeapYear()
	{
		try {
			System.out.println("enter the year");
			int x=sc.nextInt();
			if(x%400==0)
				System.out.println(x+" is a leap year");
			else if(x%4==0&&x%100!=0)
				System.out.println(x+" is the leap year");
			else
			System.out.println(x+" is not a leap year");
		} catch (InputMismatchException e) {
			
			System.out.println("enter valid input");
		}
		catch (Exception e)
		{
		   e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		CheckIfLeapYear lp=new CheckIfLeapYear();
		lp.LeapYear();
	}

}
