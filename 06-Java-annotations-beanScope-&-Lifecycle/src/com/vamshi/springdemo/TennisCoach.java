package com.vamshi.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired   //using Qualifier with fields.
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> Tenniscoach: inside default constructor\n");
	}
	
	//Using @Qualifier with constructor
	/*
	@Autowired
	public  TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		
		System.out.println(">> TennisCoach: inside constructor using @Autowired and @qualifier");
		
		fortuneService = theFortuneService;
	}
	*/
	
	//method injection
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
		return "Practice your backhand volley\n";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doMyStartUpStuff() {
		
		System.out.println("This is doMyStartUpStuff() method.\n");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("This is doMyCleanUpStuff()");
	}
	

}
