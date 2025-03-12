package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Lazy(true)
public class DTDC implements ICourier{
	
	public DTDC()
	{
		System.out.println("DTDC::0-param constructor");
	}
	@Override
	public final String drive(int oid)
	{
		return "DTDC courier is ready to deliver "+oid+" order number products";
		
	}

}
