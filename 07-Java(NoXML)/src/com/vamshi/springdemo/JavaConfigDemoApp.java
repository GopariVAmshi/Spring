package com.vamshi.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read Spring configuration file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
				
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//Calling SwimCoach methods.
		System.out.println("Email is:"+theCoach.getEmail());
		System.out.println("Team is:"+theCoach.getTeam());
				
		//close context
		context.close();

	}

}
