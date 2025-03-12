//wishMessage generator target class
package com.nt.sbeans;

import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("sf")
public class SeasonFinder {
//@Autowired //field injection-->most preferred injection
private LocalDateTime dateTime;//Has-a-property

//@Autowired //setter injection
/*
 * public void setLDT(LocalDateTime dateTime) {
 * System.out.println("SeasonFinder.setLDT()"); this.dateTime=dateTime; }
 */
//@Autowired //constructor injection--->fastest injection
/*
 * public SeasonFinder(LocalDateTime dateTime) {
 * System.out.println("SeasonFinder.SeasonFinder()"); this.dateTime=dateTime; }
 */
@Autowired //arbitrary method injection
public void assignData(LocalDateTime dateTime) {
	System.out.println("SeasonFinder.assignData()");
	this.dateTime=dateTime;
}
//business method
public String FindSeason() {
	Month month=dateTime.getMonth();
	
	
	
    return determineSeason(month); 
	
}
private String determineSeason(Month month) {
 String season;
  switch(month) {
  case JANUARY:
  case DECEMBER:
  case NOVEMBER:
  case OCTOBER:
	  season="Winter ";
	  break;
  case SEPTEMBER:
  case AUGUST:
  case JULY:
  case JUNE:
	  season="mansoon ";
	  break;
  case MAY:
  case APRIL:
  case MARCH:
  case FEBRUARY:
	  season="summer ";
	  break;
	  default:
		 season="unknown";
  }
  return season;

}
}
