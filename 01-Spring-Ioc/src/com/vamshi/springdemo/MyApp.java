package com.vamshi.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		Coach theCoach=new TrackCoach();
		
		//Use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
