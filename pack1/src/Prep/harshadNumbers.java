package Prep;
//harshad numbers are the number which can be divided by some of it's digits


public class harshadNumbers {

	public static void main(String[] args) {
		//make a copy of original Number
		int n=47;
		//declare a variable to store the sum of digits
		int result=n;
		int sum=0;
		//perform logic of calculating sum of digits 
		while(n!=0)
		{
			int pick_last=n%10;
			sum+=pick_last;
			n=n/10;
			
		}
		if(result%sum==0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a Harshad Number");
	}
}
