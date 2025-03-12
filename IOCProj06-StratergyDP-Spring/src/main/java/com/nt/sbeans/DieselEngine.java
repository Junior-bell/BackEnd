package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine{
	@Override
	public final void StartEngine()
	{
		System.out.println("DieselEngine.StartEngine()");
	}

	@Override
	public final void StopEngine()
	{
		System.out.println("DieselEngine.StopEngine()");
	}
}
