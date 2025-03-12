package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//target class
@Component("fpkt")
public final class Flipkart {

	@Autowired
	@Qualifier("dtdc")
	private  ICourier courier;
	
	//note that 0 param constructor and default constructors different
	public Flipkart() {
		System.out.println("Flipkart::0-param constructor");
	}
	
	public String shopping(String items[],double prices[])
	{
	  System.out.println("Flipkart.shopping()");
	  //calculate bill amount
	  double billAmount=0.0;
	  for(double p:prices)
	  {
		  billAmount=billAmount+p;
	  }
	  //generate order id randomly
	  int oid=new Random().nextInt(100000);
	  //deliver the  order using courier
	  String msg=courier.drive(oid);
	  return  Arrays.toString(items)+" are shopped having bill amount::"+billAmount+"--->"+msg;	  
	}
	
	
}
