package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {

	@Override
	public final void StartEngine() {
		System.out.println("PetrolEngine.StartEngine()");
	}

	@Override
	public final void StopEngine() {
		System.out.println("PetrolEngine.StopEngine()");
		
	}
	
}
