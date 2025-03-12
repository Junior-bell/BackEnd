package Prep;

import java.util.Scanner;

public class sumofNnumbersWithRecursions {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("enter the number");
	int n=sc.nextInt();
	
	int sum=getsum(n);
	System.out.println("sum "+sum);
}

 static int getsum(int n)
 {
	 if(n==0)
		 return n;
	 return n+getsum(n-1);
 }
}
