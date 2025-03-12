package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
//@Lazy(true)
public final class BlueDart implements ICourier{

	public BlueDart() {
		System.out.println("BlueDart::0-param constructor");
	}
	@Override
	public final String deliver(int oid)
	{
		return " BlueDart courier is ready to deliver "+oid+" order number products";
	}
}
