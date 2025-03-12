package Prep;

import java.util.Scanner;

public class GreatestOf_3_numbers {
	Scanner sc = new Scanner(System.in);

	public void FindGreatest() {
       System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter third number");
		int c=sc.nextInt();
	    //checking if num1 is greatest
	    if (a >= b && a >= c)
	        System.out.println (a+ " is the greatest");
	    //checking if num2 is greatest
	    else if (b >= a && b >= c)
	        System.out.println (b + " is the greatest");
	    //checking if num2 is greatest
	    else if (c>=a && c>=b)
	        System.out.println (c + " is the greatest");
	}
	public static void main(String[] args) {
		GreatestOf_3_numbers go=new GreatestOf_3_numbers();
		go.FindGreatest();
	}
}
