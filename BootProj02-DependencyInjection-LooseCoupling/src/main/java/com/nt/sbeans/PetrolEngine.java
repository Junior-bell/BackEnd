package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("PEngg")
public class PetrolEngine implements IEngine {

	@Override
	public final void StartEngine() {
		System.out.println("PetrolEngine.StartEngine()");
		
	}

	@Override
	public void StopEngine() {
		System.out.println("PetrolEngine.StopEngine()");
		
	}

}
