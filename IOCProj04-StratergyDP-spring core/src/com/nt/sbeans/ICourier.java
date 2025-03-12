package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("courier")
@Lazy(true)
public interface ICourier {

	public String drive(int oid);
}
