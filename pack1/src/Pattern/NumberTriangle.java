package Pattern;

public class NumberTriangle {

	public static void printPattern(int n)
	{
		int i,j;
		for(i=0;i<=n;i++)//outer loop to handle rows
		{
			for(j=1;j<=n-i;j++)//inner loop to handle spaces before printing numbers	
			{//for example let |be the space so=|||||1
				//in next iteration ||||2 2 and so on
				System.out.print(" ");
			}
		 for(j=1;j<=i;j++)
		 {
			 System.out.print(i+" ");
		 }
		 System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=6;
		printPattern(n);
	}
}
//output
/*   1
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 
 */
