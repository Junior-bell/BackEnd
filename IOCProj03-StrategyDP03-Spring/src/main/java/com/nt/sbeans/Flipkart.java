package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("fpkt")
public class Flipkart  {

	@Autowired
	@Qualifier("bDart")
	private Courier courier;
	
	public String shopping(String items[],double prices[])
	{
		//calculate bill amount
		double billAmount=0.0;
		for(double price:prices)
		billAmount=billAmount+price;
		
		//generate the order id(Random order id as a number)
		int oid=new Random().nextInt(10000);
		//deliver the products using Courier
		String msg=courier.deliver(oid);
		
		return Arrays.toString(items)+" items with billAmount:::"+billAmount+"--->"+msg;
		
	}
	
	
}
