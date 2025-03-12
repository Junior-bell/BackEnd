package com.nt.sbeans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

	@Autowired
	@Qualifier("pEngine")
	private IEngine engine;
	
	public void setEngine(IEngine engine)
	{
		this.engine=engine;
	}
	
	public void Journey(String start,String stop) throws InterruptedException
	{
		double distance=GenerateRandomDistance();
		engine.StartEngine();
		System.out.println("Starting the journey from "+start+" to "+stop);
		System.out.println("journey distance: "+distance+" Kilometers");
		//reached to destination 
		Thread.sleep(3000);
		System.out.println("Arrived at "+stop);
		
		engine.StopEngine();
		
		
	}
	
	private double GenerateRandomDistance() {
		//create instance of random class
		Random random=new Random();
		
		//Generate the random distance between 100 to 2000 kilometers
		double distance=100.0+(2000-100)*random.nextDouble();
		distance=Math.round(distance*100.0)/100.0;
		return distance;
		
	}
	
}
