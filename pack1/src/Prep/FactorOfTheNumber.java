
package Prep;

public class FactorOfTheNumber {

	public static void main(String[] args) {
		int num=10;
		System.out.println("Factors of the "+num+" are");
		for(int i=1;i<=num;i++)
			if(num%i==0)
				System.out.println(i+" ");
	}
}
