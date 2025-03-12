package Prep;

public class StrongNumber {

	public static void main(String[] args) {
		int num=145;
		if(detectStrong(num))
			System.out.println(num+" is a strong number");
		else
			System.out.println(num+" is not a strong number");
	}
	
	//function to calculate factorial of 
	static int facto(int n)//for example n=5 for first iteration
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;//1*2*3*4*5=120
		}
		return fact;
	}
	static boolean detectStrong(int num)
	{
		int digit,sum=0;
		int temp=num;
		boolean flag=false;
		//calculate 1!+4!+5!=145
		while(temp!=0)
		{
			digit=temp%10;//145%10=5;14%10=4,1%10=1
			sum=sum+facto(digit);//120,24,1+120+24=145
			temp=temp/10;
		}
		//return 1 if both equal to 0 or else
		if(num==sum)
			flag =true;
		else
			flag=false;
		
		return flag;
	}
}
