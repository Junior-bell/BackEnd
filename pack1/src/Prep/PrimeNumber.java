package Prep;

public class PrimeNumber {
public static void main(String[] args) {
	int i,n=24;
	 Boolean isPrime=true;
	if(n<2)//the given number should be greater than 2
	{
		isPrime=false;
	}
	else {
		for(i=2;i<n/2;i++)//start the loop to check if the given number is prime number or not!
		{
			if(n%i==0)//check if the remainder is zero
			{
				isPrime=false;
				break;
			}
			
		}
	}
	String result= isPrime? "is a Prime": "not a prime number";
	System.out.println("the given number "+n+" is "+result);
}
}
