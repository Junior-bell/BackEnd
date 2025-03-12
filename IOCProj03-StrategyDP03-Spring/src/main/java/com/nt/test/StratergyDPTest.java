package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.Flipkart;

public class StratergyDPTest {
public static void main(String[] args) {
	

	//creating IOC container
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	//get target class obj
	Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
	//invoke business methods
	String resultMsg=fpkt.shopping(new String[]{"shirt, trouser"},new double[] {6000.0,7000.0});
	System.out.println(resultMsg);
	//closing the container
	ctx.close();
	
	}
}