package Prep;

import java.util.Scanner;

public class SumOfGivenRange {
	Scanner sc=new Scanner(System.in);
	public void sum()
	{
		System.out.println("enter the first number ");
		int n = sc.nextInt();
		System.out.println("enter the second number");
		int m=sc.nextInt();
		int sum = 0;
		if(n<m) {
		for (int i = n; i <= m; i++) {
			sum = sum + i;
		}
		}
		else
		{
			System.out.println("first number should be smaller than second number");
		}
		System.out.println("sum is==> "+sum);
	
		/*
		 * or we can use the nth term sum calculation formula instead of loop
		 * System.out.println(n(n+1)/2);
		 */
	}
  public static void main (String[]args)
  {
		SumOfGivenRange so = new SumOfGivenRange();
		so.sum();

  }
}
