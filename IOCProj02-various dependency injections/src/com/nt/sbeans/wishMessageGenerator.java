package com.nt.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class wishMessageGenerator {
   @Autowired
   private LocalDateTime localdateTime;
    
		public String getMessage(String user) {
		DayOfWeek dayOfWeek=localdateTime.getDayOfWeek();
		if(dayOfWeek==DayOfWeek.SATURDAY||dayOfWeek==DayOfWeek.SUNDAY) {
			return "Happy weekend !"+user;
		}
		else {
			return "Good day !"+user;
		}
	}
}
