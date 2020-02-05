package com.vamshi.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	//define a constructor for dependency injection
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Baseball coach says:Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my firtuneService to get a fortune
		
		return fortuneService.getFortune();
		
	}
	
}
