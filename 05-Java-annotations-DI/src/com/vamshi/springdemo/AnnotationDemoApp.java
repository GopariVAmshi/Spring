package com.vamshi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		//Coach soccer=context.getBean("soccerCoach",Coach.class);
		
		
		SwimCoach swim=context.getBean("swimCoach",SwimCoach.class);
		
		
		//call a method on the bean
		System.out.println("TennisCoach Class: "+theCoach.getDailyWorkout());
		//System.out.println(soccer.getDailyWorkout());
		System.out.println("TennisCoach Class:"+theCoach.getDailyFortune());
		
		System.out.println("SwimCoach class:"+swim.getDailyWorkout());
		System.out.println("SwimCoach class:"+swim.getDailyFortune());
		System.out.println("email: " + swim.getEmail());
		System.out.println("team: " + swim.getTeam());
		//close context
		context.close();

	}

}
