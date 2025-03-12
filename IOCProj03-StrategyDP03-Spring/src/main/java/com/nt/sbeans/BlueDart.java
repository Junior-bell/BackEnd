package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements Courier{

	public String deliver(int oid)
	{
		return oid+" items are kept for delivery by BlueDart";
	}
}
