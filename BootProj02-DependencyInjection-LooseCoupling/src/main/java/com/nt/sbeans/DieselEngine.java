package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("DEngg")
public class DieselEngine implements IEngine {

	@Override
	public void StartEngine() {
		System.out.println("DieselEngine.StartEngine()");
		
	}

	@Override
	public void StopEngine() {
	System.out.println("DieselEngine.StopEngine()");
		
	}

	
}
