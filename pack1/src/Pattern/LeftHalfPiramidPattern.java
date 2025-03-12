package Pattern;

public class LeftHalfPiramidPattern {

	public static void printPattern(int n)
	{
		int i,j;
		for(i=1;i<=n;i++)//loop to handle outer part
		{
			for(j=1;j<=i;j++)//remember that you have to end loop at i when you want to print piramid like pattern
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
