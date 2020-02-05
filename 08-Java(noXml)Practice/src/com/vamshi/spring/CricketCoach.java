package com.vamshi.spring;

import org.springframework.stereotype.Component;

//@Component
public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		return "Practice OnDrive shot for 30 minutes";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
