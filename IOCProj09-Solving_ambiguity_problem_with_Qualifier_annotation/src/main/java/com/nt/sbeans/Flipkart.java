package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//target class
@Component("fpkt")
@PropertySource("com/nt/commons/Info.properties")
public final class Flipkart {
    //Has-a property
	
	@Autowired //field injection
	/*
	 * //@Qualifier("${courier.id}") invalid becoz we can not 
	 *  use place holder
	 * $<key> in Qualifier annotation-Qualifier annotation
	 * @Value("${courier.id}")
	 * private String beanid;
	 * @Qualifier("beanid") invalid cause will can not pass 
	 * variable name to @Qualifier as bean id
	 */
	@Qualifier("shipment")
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
	  String msg=courier.deliver(oid);
	  return  Arrays.toString(items)+" are shopped having bill amount::"+billAmount+"--->"+msg;	  
	}
	
	
}
