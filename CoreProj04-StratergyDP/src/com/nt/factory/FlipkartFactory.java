package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkartFactory {

	public static Flipkart getInstance(String courierType)
	{
		//create dependent class obj;
		Courier courier=null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("BlueDart"))
			courier=new BlueDart();
		else
			throw new IllegalArgumentException("invalid Courier type");
		//create target class
		Flipkart fpkt=new Flipkart();
		//assign dependent class object to target class obj;
		fpkt.setCourier(courier);
		return fpkt;
		
	}
}
