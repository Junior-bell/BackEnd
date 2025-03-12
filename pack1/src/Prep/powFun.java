package Prep;

import java.util.Scanner;

public class powFun {

	public static int pow(int a,int b)
	{
		if(b!=0)
			return a*pow(a,b-1);
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number and power");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=pow(a,b);
		System.out.println(res);
		sc.close();
	}

}
