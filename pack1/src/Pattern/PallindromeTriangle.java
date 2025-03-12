package Pattern;

public class PallindromeTriangle {

	public static void printPattern(int n)
	{
		int i,j;
		for(i=1;i<n;i++) 
		{
			for(j=1;j<=2*(n-i);j++) 
			{
				System.out.print(" ");
			}
			
			//first part of the pallindrome
			for(j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			//second part of the pallindrome
			for(j=2;j<=i;j++)
			{
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
/*
          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
 */
