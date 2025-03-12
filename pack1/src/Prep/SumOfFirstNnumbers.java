package Prep;

import java.util.Scanner;

public class SumOfFirstNnumbers
{
	static Scanner sc=new Scanner(System.in);
	public void sumOf()
	{
	  System.out.println("Enter the number to calculate sum");
	  int n=sc.nextInt();
	 int sum=(n*(n+1))/2;
		System.out.println("sum "+sum);
	}
	public static void main(String[] args) {
		SumOfFirstNnumbers so = new SumOfFirstNnumbers();
		so.sumOf();
		sc.close();
	}
}