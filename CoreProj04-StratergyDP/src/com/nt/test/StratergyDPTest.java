package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StratergyDPTest {
	public static void main(String[] args) {
		//use factory pattern to target class object 
		Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
		//invoke business method.
		String ResultMsg=fpkt.shopping(new String[] {"shirt","trouser"} ,new double[] {5000.0,6000.0});
		
			System.out.println(ResultMsg);	
	}

}
