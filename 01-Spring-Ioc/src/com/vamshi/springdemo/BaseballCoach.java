package com.vamshi.springdemo;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Baseball coach says:Spend 30 minutes on batting practice";
	}
	
}
