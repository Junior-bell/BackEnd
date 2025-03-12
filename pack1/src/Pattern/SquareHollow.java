package Pattern;

public class SquareHollow {

	public static  void printPattern(int n)
	{
		int i,j;
		for(i=0;i<n;i++)//it is the outer loop to handle rows 
		{
			for(j=0;j<n;j++)// inner loop to handle columns
			{
				//only print * when it is in first or last row only
				if(i==0||j==0||i==n-1||j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
			
	}
	public static void main(String[] args) 
	{
		int n=6;
		printPattern(n);
	}
}

//output
/*
******
*    *
*    *
*    *
*    *
******
*/


