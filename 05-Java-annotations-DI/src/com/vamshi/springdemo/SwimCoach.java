package com.vamshi.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{
	
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	public SwimCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
}
