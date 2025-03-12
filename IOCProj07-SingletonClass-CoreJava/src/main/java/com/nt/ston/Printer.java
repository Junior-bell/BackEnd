package com.nt.ston;

import org.springframework.context.annotation.Scope;

//singleton class
@Scope("singleton")
public class Printer {
 
	//generating private static instance of Printer class
	private static Printer INSTANCE;
	
	//private constructor
	private Printer()
	{
		System.out.println("Printer::0-param-constructor");
	}
	
	public static Printer getInstance() {
		if(INSTANCE==null)
			INSTANCE=new Printer();
		return INSTANCE;
	}
	
	//business method
	public void PrintMessage(String msg) {
		System.out.println(msg);
	}
	
}
