package com.vamshi.springdemo;

public class CricketCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Cricket coach says: practice fast bowling for 30 mins";
	}
}
