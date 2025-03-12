package pack1;

import java.util.Scanner;

public class Scan1 {

	static Scanner sc=new Scanner(System.in);
	void meth1() {
		System.out.println("enter your first number");
		int a=sc.nextInt();
		System.out.println("a value is : "+a);
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("b value is "+b);
		int c=a+b;
		System.out.println("addition : "+c);
		
	}
	void meth2()
	{
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(num%2==0)
		  System.out.println("the given number "+num+" is even ");
		else
			System.out.println("given number is odd "+num);
	}
	void meth3(String username,int age)
	{
		if(age>18)
			System.out.println(username+" you can vote");
		else
			System.out.println("you cannot vote as you need to wait for "+(age-18)+"years");
	}
	 int meth4(int x) {
	        if (x <= 10) {
	            System.out.println("if block is executed");
	            System.out.println("enter a number");
	            return sc.nextInt();
	        } else {
	            System.out.println("else block is executed");
	            return x; // Or any other default value
	        }
	    }
	public static void main(String [] args)
	{
		Scan1 aobj=new Scan1();
		
		  aobj.meth1(); aobj.meth2(); System.out.println("what is your name?"); String
		  username=sc.next(); System.out.println("what is your age?"); 
		  int userage=sc.nextInt(); aobj.meth3(username, userage);
		 
		System.out.println("meth4() is returning :"+aobj.meth4(5));
	}
}
