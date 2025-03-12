package Prep;

import java.util.Scanner;

public class HcfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b; int hcf=1;
		System.out.println("enter first number");
		 a=sc.nextInt();
		System.out.println("enter second number");
		 b=sc.nextInt();
		 sc.close();
		 hcf=findHcf(a,b);
		 System.out.println("HCF of the two given number is "+hcf);
		
	}
	public static int findHcf(int a,int b)
	{
		while(b!=0)//b=15
		{
			int temp=b; //b=15 so temp will be 15
			b=a%b;  //b=15 a=9 so 9%15=9 b=9
			a=temp; // as temp was 15 so a=15 now and b=9
		}
		return a;
	}
}
/*note
 first iteration
for example a=9,b=15
first iteration 
int temp=b //15
b=a%b 9%15=9
a=temp a=15

second iteration
int temp=b; b=9
b=a%b so 15%9=6 b=6
a=temp so a=9

third iteration 
int temp=b so b=6
b=a%b; so 6%9=3
a=temp so a=6

fourth iteration
int temp=b; so b=3
b=a%b so 6%3=0
a=temp so a=3

as b=0 loop will end and 
a=3 will returned to hcf=findhcf(a,b)=3
so hcf=3
*/
