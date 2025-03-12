package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig;
import com.nt.sbeans.Vehicle;

public class StratergyDPTest{
public static void main(String[] args) throws InterruptedException {
	

	//creating a IOC container
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
	vehicle.Journey("hyd", "Aurangabad");
	
	//closing the container
	ctx.close();
}
}
