package Prep;

import java.util.Scanner;

public class armstrongNumbersIngivenRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the upper and lower range to "
				+ "find the armstrong numbers");
		int low=sc.nextInt();
		int high=sc.nextInt();
		System.out.println("armstrong numbers between "+low+" and "+high+" are:");
		
		//loop to find armstrong number in given range
		for(int num= low;num<=high;num++)//loop to find armstrong number
		{
			int sum=0,temp,digit,len;
			len=getOrder(num);
			temp=num;
			//loop to extract the digit and order of the number and sum
			while(temp!=0)
			{
				//extract the digit
				digit=temp%10;
				sum=sum+(int)Math.pow(digit, len);
				temp/=10;
			}
			if(sum==num)
				System.out.println(num+" ");
		}
		sc.close();
	}
		private static int getOrder(int num)
		{
			int len=0;
			while(num!=0)
			{
				len++;
				num=num/10;
			}
			return len;
		}
}
