package Pattern;

public class SquareFillPattern {

	public static void printPattern(int n)
	{
		int i,j;
		//loop to handle outer layer
		for(i=0;i<=n;i++)
		{
		  //loop to handle inner layer
			for(j=0;j<=n;j++)
			{
				System.out.print("*");
			}
			//printing new line for each row
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=6;
		printPattern(n);
	}
}
