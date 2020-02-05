package com.vamshi.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
	
	@Autowired   //using Qualifier with fields.
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	@Override
	public String getDailyWorkout() {
		return "Juggle the Soccer Ball for 3 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
