package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//target class 
@Component("sf")
public class SeasonFinder {

	@Autowired
	private LocalDate ldt;
	
	public String findSeason()
	{
		System.out.println("SeasonFinder.findSeason()");
		//get currrent month
		int month=ldt.getMonthValue();
		//show season name
		if(month>=3&& month<=6)
			return "summer season";
		else if(month>=7&& month<=10)
			return "rainy season";
		else
			return "winter season";
	}
}
