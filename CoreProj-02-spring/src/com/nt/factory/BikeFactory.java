package com.nt.factory;

import com.nt.comps.Bike;
import com.nt.comps.BulletBike;
import com.nt.comps.ElectricBike;
import com.nt.comps.Sportsbike;
import com.nt.comps.StandardBike;

public class BikeFactory {

	public static Bike orderBike(String type) {
		Bike bike=null;
if(type.equalsIgnoreCase("standard"))
    bike=new StandardBike();
    else if(type.equalsIgnoreCase("Sports"))
    	bike=new Sportsbike();
    else if(type.equalsIgnoreCase("Electric"))
    	bike=new ElectricBike();
    else if(type.equalsIgnoreCase("Bullet"))
    	bike=new BulletBike();
    else
    	throw new IllegalArgumentException("invalid Bike type");
	  return bike;
	}	
}
