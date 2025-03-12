package Prep;

public class CheckNumPallendrome {
	
//check if given number  is pallindrome.
	public static void main(String[] args) {
	int num=12321, rev=0,rem,temp;
	temp=num;
	while(num!=0)
	{
	rem=num%10;
	rev=rev*10+rem;
	num/=10;
	}
	if(temp==rev)
	{
		System.out.println("the given number "+num+" is pallindrome");
	}
	else {
		System.out.println("the given number "+num+"is not a pallindrome" );
	}

	}

}
