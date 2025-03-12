package com.nt.comps;

public final class DTDC implements Courier {

	@Override
	public final String deliver(int oid) {
		return oid+" Ordered items kept for delivery for DTDC";
	}
}
