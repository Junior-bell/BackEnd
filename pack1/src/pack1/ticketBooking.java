package pack1;

import java.util.Arrays;
import java.util.Scanner;

public class ticketBooking {

	Scanner sc=new Scanner(System.in);
	void meth1() {
		System.out.println("------welcome-------");
		System.out.println("1) Oculus ");
		System.out.println("2) Insidious ");
		System.out.println("3) Smile ");
		System.out.println("Enter your Movie name");
		String movie=sc.next();
		System.out.println("you have selected Movie "+movie);
		System.out.println("How many tickets you need ");
		int ticket=sc.nextInt();
		String names[] =new String [ticket];
		System.out.println("please enter "+names.length+" names to book your tickets ");
		for(int i=0;i<=names.length-1;i++)
		{
			names[i]=sc.next();
		}
		System.out.println(names.length +"tickets were booked for "+movie);
		System.out.println("person names : "+Arrays.toString(names));
		for(int i=0;i<=names.length-1;i++)
		{
			System.out.println(names[i]+" ?");
		}
	}
	public static void main(String[] args) {
		new ticketBooking().meth1();
	}
}
