package com.vamshi.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfiguration {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		CricketCoach theCoach = context.getBean("cricketCoach",CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
