package Prep;

public class SumOfDigits1 {
 
	public static void main(String[] args) {
		String number="56789";
		int count=0;
		for(int i=0;i<number.length();i++)
		{
			count+=Integer.parseInt(String.valueOf(number.charAt(i)));
		    //converting string to Integer and capture each number or character in count 
		}
		System.out.println(count);//print count which captured each number and calculate sum 
	}
}
