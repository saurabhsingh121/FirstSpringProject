package com.practice2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestApp {
	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach cricketCoach = context.getBean("myCoach",Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
	}
}
