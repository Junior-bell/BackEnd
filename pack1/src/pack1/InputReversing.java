package pack1;

import java.util.Scanner;

public class InputReversing {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		Double d=scan.nextDouble();
		scan.nextLine();
		String s=scan.nextLine();
		System.out.println("String s : "+s);
		System.out.println("Double d :"+d);
		System.out.println("Int i : "+i);
		scan.close();
		
	}
}
