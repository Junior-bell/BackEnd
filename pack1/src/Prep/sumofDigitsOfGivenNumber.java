package Prep;

public class sumofDigitsOfGivenNumber {

	public static void main(String[] args) {
		int num=12345, sum=0,digit;
		
		while(num!=0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("The sum of the given number is "+sum);

	}

}
