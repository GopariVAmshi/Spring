package com.vamshi.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	 public TrackCoach(FortuneService theFortuneService) {
		 
		 fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Track coach says: Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//add an in-it method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: insie method doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: insie method doMyCleanupStuff");
	}
}
