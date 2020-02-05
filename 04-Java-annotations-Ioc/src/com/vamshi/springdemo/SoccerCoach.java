package com.vamshi.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Juggle the Soccer Ball for 3 minutes";
	}

}
