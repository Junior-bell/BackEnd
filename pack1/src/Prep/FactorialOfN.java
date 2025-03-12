package Prep;

public class FactorialOfN {

	public static void main(String[] args) {

		int num=6;
		System.out.println("factorial of given num "+num+" is "+factorial(num));
	}
	public static int factorial(int n)
	{
		int res=1,i;
		for(i=2;i<=n;i++)
		res=res*1;
		return res;
			
	}
}
