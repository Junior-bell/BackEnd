package Pattern;

public class ReverseTrianglePattern {

	public static void printPattern(int n)
	{
		int i,j,k;
		//outer loop to handle loop
		for(i=n;i>=1;i--)
		{
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++)
			{
				//printing the stars
				if(k==1||i==n||k==(2*i-1))
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
	public static void main(String[] args) {
		int n=6;
		printPattern(n);
	}
}
