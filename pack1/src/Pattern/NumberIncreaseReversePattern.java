package Pattern;

public class NumberIncreaseReversePattern {

public static void printPattern(int n)
		{
			int i,j;
			for(i=n;i>=1;i--)//outer loop to handle number of rows
			{
				//inner loop to handle number of columns
				for(j=1;j<=i;j++)
				{
					//printing column values upto the rows
					System.out.print(j+" ");
				}
				System.out.println();
				
			}
		}
		public static void main(String[] args) {
			int n=6;
			printPattern(n);
		}
	}
/*output
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 */

