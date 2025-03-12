package Pattern;

public class TrianglePattern {

	public static void printPattern(int n)
	{
		int i,j;
		for(i=0;i<=n;i++)
		{
			for(j=n-i;j>=1;j--)//when print triangle shaped pattern you must remember this loop
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=6;
		printPattern(n);
		
	}
}
