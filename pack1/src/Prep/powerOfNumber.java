package Prep;
//program to calculate the power of a number
public class powerOfNumber {
 static int base;
 static int exponent;
 public	static int powerFun(int base,int exponent) {
		int result=1;
		powerOfNumber.base=base=2;
		powerOfNumber.exponent=exponent=3;
		for(int i=0;i<exponent;i++)
		{
			result=result*base;
		}
		return result;
	}
	public static void main(String[] args) {
	//result is taken and initialized so that default value of 0 shouldn't be taken
		
	int	result1=powerOfNumber.powerFun(2,3);
	System.out.println("The result of given number "+base+" is having power of "+exponent+" is "+result1);

		
	}
}
