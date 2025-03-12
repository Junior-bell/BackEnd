package Prep;
//program to find the prime number in given range
public class PrimeInGivenRange{
	
	static boolean isPrime(int n)
	{ 
		if(n<2)
		{
			return false;
		}
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				return false;
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		int lower=1,upper=50;
		for(int i=lower;i<=upper;i++)
		{
			if(isPrime(i))		
			System.out.println(i);

		
		}
	}
}