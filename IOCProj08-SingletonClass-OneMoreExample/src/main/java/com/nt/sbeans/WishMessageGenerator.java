package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
public class WishMessageGenerator {

	@Autowired
	@Qualifier("ldt")  //injected has a property
	private LocalDateTime dateTime;
	
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator::0-param-constructor");
	}
	public String showWishMessage(String user)
	{
		// get current hour of the day.
		int hour = dateTime.getHour();// 24 hour format

		if (hour < 12)
			return "Good morning." + user;
		else if (hour < 16)
			return "Good afternoon." + user;
		else if (hour < 20)
			return "Good Evening." + user;
		else
			return "Good night." + user;
	}
}
