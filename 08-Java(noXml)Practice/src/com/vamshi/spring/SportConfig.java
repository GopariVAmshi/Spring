package com.vamshi.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
	
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach cricketCoach() {
		return new CricketCoach(happyFortuneService());
	}
	
}
