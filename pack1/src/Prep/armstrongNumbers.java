package Prep;

public class armstrongNumbers
{
	public static int order(int x)
	{
		int len=0;
		while(x!=0)
		{
			len++;
			x=x/10;
		}
		return len;
	}
	public static boolean armstrong(int num,int len)
	{
		int digit,temp=num,sum=0;
		while(temp!=0)
		{
			digit=temp%10;
			sum=sum+(int)Math.pow(digit, len);
			temp=temp/10;
			
		}
		return num==sum;
	}
	public static void main(String[] args) {
		int num=507,len;
		//function to get order
		len=order(num);
		if(armstrong(num, len)) //it will check if sum==num
			System.out.println(num+" is an armstrong number");
		else
			System.out.println(num+" is not an armstrong number");
	}
}