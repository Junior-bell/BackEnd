package Prep;
public class PrimeFactorOfNumber{
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)// to check if given number n is prime or not
		{
			if(n%i==0)
				return false;// if  not  prime return false
		}
		return true;// if prime return true
	}
	//to check if given number is prime factor or not
	public static void primeFactor(int n)
	{
		for(int i=2;i<=n;i++)
		if(isPrime(i)==true)//if prime number then 
		{
			int x=n;
			while(x%i==0)
			{
				System.out.println(i+" ");
				x=x/i; //for example x=2 then 2=2/2=0,x=4,then prime, if not, not prime
			}
		}
			
		
	}//primefactor
	public static void main(String[] args) {
	
		int n=90;
		primeFactor(n);
	}
}