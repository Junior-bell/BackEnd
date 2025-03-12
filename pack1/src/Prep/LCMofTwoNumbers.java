package Prep;

import java.util.Scanner;

public class LCMofTwoNumbers {

  public static void main(String[] args) {
	int a,b,hcf;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number");
	a=sc.nextInt();
	System.out.println("enter the second number");
	b=sc.nextInt();
	
	hcf=findhcf(a,b);
	int lcm=Math.abs(a*b)/hcf;
	System.out.println("lcm of "+a+" and "+b+" is "+lcm);
	sc.close();
}	
  public static int findhcf(int a,int b)
  {
	  
	  while(b!=0)
	  {
		  int temp;
		  temp=b;
		  b=a%b;
		  a=temp;  
	  }
	  return a;
	  
  }
}
