package Prep;

import java.util.Scanner;

public class FindGreatestNumber {
	 static Scanner sc=new Scanner(System.in);
	public void find_greatest()
	{
	 
		System.out.println("enter first number");
		int n=sc.nextInt();
		System.out.println("enter second number");
		int m=sc.nextInt();
		if(n>m)
			System.out.println(n+" First number is the greatest number");
		else if(n==m)
			System.out.println("both are equal");
		else
		System.out.println(m+" is the greatest number");
	}
	public static void main(String[] args) {
		FindGreatestNumber fg=new FindGreatestNumber();
		fg.find_greatest();
		sc.close();
	}
}
