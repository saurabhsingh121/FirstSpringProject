package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {
	
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring controller
		Coach cricketCoach = context.getBean("cricketCoach",Coach.class);
		
		//call methods on the bean
		//System.out.println(cricketCoach.getDailyWorkOut());
		System.out.println(cricketCoach.getDailyFortune());
		
		//Call our new methods to get the literals values
		//System.out.println("My email address: "+ cricketCoach.getEmailAddress());
		//System.out.println("My favorite team: "+ cricketCoach.getTeam());
		//close the context path
		context.close();
}
}
