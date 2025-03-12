package Pattern;

public class ButterflyPattern {

	public static void printPattern(int n)
	{
		int i,j;
		//outer loop to handle upper part
		for(i=1;i<=n;i++)
		{
			//inner loop to print stars
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			//inner loop to print spaces
			int spaces=2*(n-i);
			for(j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//outer loop to print lower part
		for(i=n;i>=1;i--)
		{
			//inner loop to print spaces
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			int spaces=2*(n-i);
			for(j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			//inner loop to print stars
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=6;
		printPattern(n);
	}
}
