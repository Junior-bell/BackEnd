package com.nt.test;

import com.nt.comps.Bike;
import com.nt.factory.BikeFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Bike bike=BikeFactory.orderBike("Electric");
		bike.drive();
		/*
		 * System.out.println("=================="); Bike
		 * bike1=BikeFactory.orderBike("Sports"); bike1.drive();
		 * System.out.println("================="); Bike
		 * bike2=BikeFactory.orderBike("Bullet"); bike2.drive();
		 * System.out.println("=================="); Bike
		 * bike3=BikeFactory.orderBike("Electric"); bike3.drive();
		 * System.out.println("=================");
		 */
	}
}
