package Prep;
//fibonacci series upto Nth Term
public class fibonacciSeriesUptoNthTerm{
	public static void main(String[] args) {		
		int num=15;
		int a=0,b=1;
		//here we are printing first two numbers
		System.out.print(a+","+b+",");
		int nextTerm;
		for(int i=2;i<num;i++)
		{
			nextTerm=a+b;
			a=b;
			b=nextTerm;
			System.out.print(nextTerm+",");
		}
	}
}