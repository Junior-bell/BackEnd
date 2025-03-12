package Prep;

import java.util.Scanner;

public class perfect {
 public static void main(String[] args) {
	

	Long n,sum=(long) 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number ");
	n=sc.nextLong();
	int i=1;//take i as a counter 
	while(i<=n/2)//iterate loop till n/2 of the number
	{
		if(n%i==0)//check if number remainder is 0 
		{
			sum=sum+i;//if true then add it to the sum
		}
		i++;
	}
	if(sum==n) 
	{
		System.out.println(n+" is a perfect number");
		
	}
	else {
		System.out.println(n+" is not a perfect number");
	}
	sc.close();
 }
}
