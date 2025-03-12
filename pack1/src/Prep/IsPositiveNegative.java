package Prep;


import java.util.Scanner;

public class IsPositiveNegative 
{
	Scanner sc=new Scanner(System.in);
	
  
 public void isPositive()
 {
	 int x;
	 System.out.println("Enter the number ");
	 x=sc.nextInt();
	if(x>0) 
	{
		System.out.println("the given number is positive");	
	}
	else if(x==0) {
		System.out.println("the given number is zero");
	}
	else
	{
		System.out.println("the given number is negative");
	}
	
 }
 public static void main(String[] args) 
 {
	   IsPositiveNegative sc = new IsPositiveNegative();
	   sc.isPositive();
}

}
