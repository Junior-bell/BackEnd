package Pattern;

public class DiamondStarPattern {

	public static void printPattern(int n)
	{
		int i,j;
		for(i=1;i<=n;i++)//outer loop to handle rows
		{
			for(j=1;j<=n-i;j++)//inner loop to handle spaces before printing stars
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)//loop to print stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--)// loop to print second part after printing triangle
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)
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
/*output of the code
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
*/
