package com.nt.comps;

public final class BlueDart implements Courier {
  
	@Override
	public final String deliver(int oid) {
		return oid+"Ordered items kept for delivery for BlueDart";
	}
}
