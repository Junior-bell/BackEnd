package Prep;

import java.util.Scanner;

public class OddEven {
 int x;
 Scanner sc=new Scanner(System.in);
	public void Oddeven()
	{
		System.out.println("enter given the number");
		x=sc.nextInt();
		if(x%2==0)
		{
			System.out.println("the given number is even");
		}
		else if(x==0) {
			System.out.println("the given number is zero");
		}
		else
		{
			System.out.println("the given number is Odd");
		}
		
	}
	public static void main(String[] args) 
	{
		OddEven oe=new OddEven();
		oe.Oddeven();
	}

}
