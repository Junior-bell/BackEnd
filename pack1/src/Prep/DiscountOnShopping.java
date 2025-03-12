package Prep;

public class DiscountOnShopping {

	void meth1(int units)
	{
		int bill=units*100;
		if(bill>1000)
		{
			int discount=(bill*10)/100;
			System.out.println(" congratulation you got 10% discount ");
			System.out.println("your final bill : "+(bill-discount));
			System.out.println("you have saved "+discount);
		}
		else
			{
			System.out.println("your bill is :"+bill);
			System.out.println("shop more "+(1000-bill)+" to get discount of 10%");
			}
		
	}
	public static void main(String[] args) {
		DiscountOnShopping dis=new DiscountOnShopping();
		dis.meth1(12);
	}
}
