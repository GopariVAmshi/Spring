package com.vamshi.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	//@Autowired    //using Qualifier with fields.
	//@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> Tenniscoach: inside default constructor");
	}
	
	//Using @Qualifier with constructor
	@Autowired
	public  TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		
		System.out.println(">> TennisCoach: inside constructor using @Autowired and @qualifier");
		
		fortuneService = theFortuneService;
	}
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: Inside doSomeCrazyStuff() method");
		this.fortuneService=theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public  TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
