package Prep;

public class AutoMorphicNumber
{
	//Method to check if given Number is AutoMorphic or Not
	public static boolean isAutomorphic(int n)
	{
		int square=n*n;
		while(n!=0)
		{
			//means not a automorphic Number
			if(n%10!=square%10)
			{
				return false;
			}
			n=n/10;
			square=square/10;
		}
		//if reaches here means automorphic Number
		return true;
	}
	public static void main(String[] args) {
		int n=376, sq=n*n;
		if(isAutomorphic(n)==true)
		{
			System.out.println("The given Number "+n+" having square "+sq+" is automorphic Number");
		}
		else
		{
			System.out.println(" The given Number "+n+" is not a automorphic Number");
		}
	}
	
}