package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

//Target class
public final class Flipkart {
 //Has-a-property
	private Courier courier;
 
	public void setCourier(Courier courier)
	{
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	//business method
	public String shopping(String items[],double prices[])
	{
		//calculate bill amount
		double billAmount=0.0;
		for(double p:prices)
		{
			billAmount=billAmount+p;
		}
		//generate order id(random number as an order)
		int oid=new Random().nextInt(1000);
		//deliver the product using order 
        String msg=courier.deliver(oid);
        return Arrays.toString(items)+"items with bill amount::: "+billAmount+"......"+msg;
        
		
	}
}
