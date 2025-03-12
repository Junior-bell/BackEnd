package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("EEngg")
public class ElectricEngine implements IEngine {

	@Override
	public void StartEngine() {
	System.out.println("ElectricEngine.StartEngine()");
		
	}

	@Override
	public void StopEngine() {
		System.out.println("ElectricEngine.StopEngine()");
		
	}

}
